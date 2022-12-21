public class Main {

    public static int checkingTheYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
        return year;
    }
    public static int checkingDeviceYear(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        return clientDeviceYear;
    }
    public static int checkingDeliveryTime(int deliveryDistance, int deliveryTime) {
        if (deliveryDistance > 20) {
            deliveryTime++;
        }
        if (deliveryDistance > 60) {
            deliveryTime++;
        }
        return deliveryTime;
    }


    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int year = 2021;
        System.out.println(checkingTheYear(year));
        // Задача 2
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        System.out.println(checkingDeviceYear(clientOS, clientDeviceYear));
        // Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        System.out.println("Потребуется дней: " + checkingDeliveryTime(deliveryDistance, deliveryTime));
    }
}