import exceptions.WrongInputException;
import util.ValidateUtils;

import java.lang.annotation.Repeatable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Calendar {
    private static final Map<Integer, Repeatable> actualTasks = new HashMap<>();
    private static final Map<Integer, Repeatable> archivedTasks = new HashMap<>();

    public static void addTask(Scanner scanner) {
        try {
            scanner.nextLine();
            System.out.println("Введите название задачи: ");
            String title = ValidateUtils.checkString(scanner.nextLine());
            System.out.println("Введите описание задачи: ");
            String description = ValidateUtils.checkString(scanner.nextLine());
            System.out.println("Введите тип задачи: 0 - Рабочая, 1 - Личная");
            TaskType taskType = TaskType.values()[Integer.parseInt(scanner.nextLine())];
            System.out.println("Введите повторяемость задачи: 0 - Однократная, 1 - Ежедневная, 2 - Еженедельная, 3 - Ежемесячная, 4 - Ежегодная");
            int occurance = scanner.nextInt();
            System.out.println("Введите дату dd.MM.yyyy HH:mm ");
            scanner.nextLine();
            createEvent(scanner, title, description, taskType, occurance);
            System.out.println("Для выхода нажмите Enter\n");
            scanner.nextLine();
        }  catch (WrongInputException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void createEvent(Scanner scanner, String title, String description, TaskType taskType, int occurance) {
        try {
            LocalDateTime eventDate = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
            Repeatable task = null;
            try {
                task = createTask(occurance, title, description, taskType, eventDate);
                System.out.println("Создана задача " + task);
            } catch (WrongInputException e) {
                System.out.println(e.getMessage());
            }
        } catch (DateTimeParseException e) {
            System.out.println("Проверьте формат dd.MM.yyyy HH:mm и попробуйте ещё раз");
            createEvent(scanner, title, description, taskType, occurance);
        }
    }

    static void editTask(Scanner scanner) {
    try {
        System.out.println("Редактирование задачи: введите Id");
        printArchivedTasks();
        int id = scanner.nextInt();
        if (!actualTasks.containsKey(id)) {
            throw new WrongInputException("Задача не найдена");
        }
        System.out.println("Редактирование 0 - заголовок, 1 - описание, 2 - тип, 3 - дата");
        int menuCase = scanner.nextInt();
        switch (menuCase) {
            case 0:
                scanner.nextLine();
                System.out.println("Введите название задачи: ");
                String title = scanner.nextLine();
                Task task0 = (Task) actualTasks.get(id);
                task0.setTitle(title);

            case 1:
                scanner.nextLine();
                System.out.println("Введите описание задачи: ");
                String description = scanner.nextLine();
                Task task1 = (Task) actualTasks.get(id);
                task1.setTitle(description);

            case 2:
                scanner.nextLine();
                System.out.println("Введите тип задачи: ");
                String taskType = scanner.nextLine();
                Task task2 = (Task) actualTasks.get(id);
                task2.setTitle(taskType);

            case 3:
                scanner.nextLine();
                System.out.println("Введите дату задачи: ");
                String localDateTime = scanner.nextLine();
                Task task3 = (Task) actualTasks.get(id);
                task3.setTitle(localDateTime);
        }
    } catch (WrongInputException e) {
        System.out.println(e.getMessage());
    }
    }

    static void deleteTask(Scanner scanner) {
        System.out.println("Текущие задачи\n");
        printArchivedTasks();
        System.out.println("Для удаления введите Id задачи\n");
        int id = scanner.nextInt();
        if (actualTasks.containsKey(id)) {
            Repeatable removedTask = actualTasks.get(id);
            archivedTasks.put(id, removedTask);
            System.out.println("Задача " + id + " удалена\n");
        } else {
            System.out.println("Такой задачи не существует\n");
        }
    }

    static void getTasksByDay(Scanner scanner) {
        System.out.println("Введите дату как dd.MM.yyyy:");
        try {
            String date = scanner.next();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate requestedDate = LocalDate.parse(date, dateFormatter);
            List<Repeatable> foundEvents = findTasksByDate(requestedDate);
            System.out.println("События на " + requestedDate + ":");
            for (Repeatable task : foundEvents) {
                System.out.println(task);
            }
        } catch (DateTimeParseException e) {
            System.out.println("Проверьте формат даты dd.MM.yyyy и попробуйте ещё раз");
        }
        scanner.nextLine();
        System.out.println("Для выхода нажмите Enter\n");
    }

    static void printArchivedTasks() {
    for (Repeatable task : archivedTasks.values()) {
        System.out.println(task);
    }
    }

    static void getGroupedByDate() {
    Map<LocalDate, ArrayList<Repeatable>> taskMap = new HashMap<>();
    for (Map.Entry<Integer, Repeatable> entry : actualTasks.entrySet()) {
        Repeatable task = entry.getValue();
        LocalDate localDate = (Repeatable) task
        if (taskMap.containsKey(localDate)) {
            ArrayList<Repeatable> tasks = taskMap.get(localDate);
            tasks.add(task);
        } else {
            taskMap.put(localDate, new ArrayList<>(Collections.singletonList(task)));
        }
    }
    for (Map.Entry<LocalDate, ArrayList<Repeatable>> taskEntry : taskMap.entrySet()) {
        System.out.println(taskEntry.getKey() + " : " + taskEntry.getValue());
    }
    }

    private static List<Repeatable> findTasksByDate(LocalDate date) {
        List<Repeatable> tasks = new ArrayList<>();
        for (Repeatable task : actualTasks.values()) {
            if (task.checkOccurance(date.atStartOfDay())) {
                tasks.add(task);
            }
        }
        return tasks;
    }
    private static Repeatable createTask(int occurance, String title, String description, TaskType taskType, LocalDateTime localDateTime) throws WrongInputException {
        return switch (occurance) {
            case 0:
                OncelyTask oncelyTask = new OncelyTask(title, description, taskType, localDateTime);
                actualTasks.put(oncelyTask.getId(), (Repeatable) oncelyTask);
                return (Repeatable) oncelyTask;

            case 1:
                DailyTask task = new DailyTask(title, description, taskType, localDateTime);
                actualTasks.put(task.getId(), (Repeatable) task);
                return (Repeatable) task;

            case 2:
                WeeklyTask task = new WeeklyTask(title, description, taskType, localDateTime);
                actualTasks.put(task.getId(), (Repeatable) task);
                return (Repeatable) task;

            case 3:
                MonthlyTask task = new MonthlyTask(title, description, taskType, localDateTime);
                actualTasks.put(task.getId(), (Repeatable) task);
                return (Repeatable) task;

            case 4:
                YearlyTask task = new YearlyTask(title, description, taskType, localDateTime);
                actualTasks.put(task.getId(), (Repeatable) task);
                return (Repeatable) task;
        };
    }
}
