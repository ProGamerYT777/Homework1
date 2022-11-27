public class Main {
    public static void main(String[] args) {
        // ДЗ 1
        // Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
           System.out.println(i);
       }
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
           System.out.println(i);
       }
        // Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        // Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // ДЗ 2
        // Задача 1
        System.out.println("Задача 1");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        // Задача 3
        System.out.println("Задача 3");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        // ДЗ 3
        // Задача 1
        System.out.println("Задача 1");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        // Задача 2
        System.out.println("Задача 2");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + salary1 / 100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
    }
}