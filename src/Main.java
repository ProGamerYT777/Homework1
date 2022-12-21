public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника — " + fullName);
        // Задача 2
        System.out.println("Задача 2");
        fullName = fullName.replace("Ivanov Ivan Ivanovich", "IVANOV IVAN IVANOVICH");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        // Задача 3
        System.out.println("Задача 3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника —  " + fullName1);
    }
}