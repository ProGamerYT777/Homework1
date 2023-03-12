import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        label:
        while (true) {
            System.out.println("Выберите пункт меню:");
            printMenu();
            if (scanner.hasNextInt()) {
                int menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                        Calendar.addTask(scanner);
                        break;
                    case 2:
                        Calendar.editTask(scanner);
                        break;
                    case 3:
                        Calendar.deleteTask(scanner);
                        break;
                    case 4:
                        Calendar.getTasksByDay(scanner);
                        break;
                    case 5:
                        Calendar.printArchivedTasks();
                        break;
                    case 6:
                        Calendar.getGroupedByDate();
                        break;
                    case 0:
                        break label;
                }
            }
        }
    }
    }
    private static void printMenu() {
        System.out.println("\nМеню работы с сотрудниками");
        System.out.println("Доступные действия:");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Редактировать задачу");
        System.out.println("3. Удалить задачу");
        System.out.println("4. Получить задачи на указанный день");
        System.out.println("5. Получить архивные задачи");
        System.out.println("6. Получить сгруппированные по датам задачи");
        System.out.println("0. Выход");
    }
}