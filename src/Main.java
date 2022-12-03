public class Main {
    public static void main(String[] args) {
        // ДЗ 1
        // Задача 1
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total <= 2459000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        // Задача 2
        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(" " + a);
            a++;
        }
        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(" " + b);
        }
        // Задача 3
        System.out.println();
        System.out.println("Задача 3");
        int totalPopulation = 12000000;
        int birthRate = 17;
        int mortality = 8;
        int rate = birthRate - mortality;
        for (int z = 1; z <= 10; z++) {
            totalPopulation += rate * totalPopulation / 1000;
            System.out.println("Год " + z + ", численность населения составляет " + totalPopulation);

        }
        // ДЗ 2
        // Задача 1
        System.out.println("Задача 1");
        int contribution = 15000;
        for (int q = 1; contribution <= 12000000; q++) {
            contribution += contribution * 7 / 100;
            System.out.println("Месяц " + q + ", сумма накоплений равна " + contribution + " рублей");
        }
        // Задача 2
        System.out.println("Задача 2");
        int contribution1 = 15000;
        for (int x = 1; contribution1 <= 12000000; x++) {
            contribution1 += contribution1 * 7 / 100;
            if (x % 6 == 0) {
                System.out.println("Месяц " + x + ", сумма накоплений равна " + contribution1 + " рублей");
            }
        }
        // Задача 3
        System.out.println("Задача 3");
        int contribution2 = 15000;
        for (int y = 1; y <= 108; y++) {
            contribution2 += contribution2 * 7 / 100;
            if (y % 6 == 0) {
                System.out.println("Месяц " + y + ", сумма накоплений равна " + contribution2 + " рублей");
            }
        }
        // Задача 4
        System.out.println("Задача 4");
        int m = 5;
        while (m <= 31) {
            if (m % 5 == 0) {
                System.out.println("Сегодня пятница, " + m + "-е число. Необходимо подготовить отчет");
            }
        m++;
        }
        // ДЗ 3
        // Задача 1
        System.out.println("Задача 1");
        for (int comet = 1822; comet <= 2054; comet++) {
            if (comet % 79 == 0) {
                System.out.println(comet);
            }
        }
        // Задача 2
        System.out.println("Задача 2");
        int n = 2;
        for (int t = 1; t <= 10; t++) {
            int p = t * n;
            System.out.println(n +  "*" + t + "=" + p);
        }
      }
    }