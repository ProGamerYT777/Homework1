public class Main {
    public static void main(String[] args) {
        // ДЗ - 1
        // Задача 1
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием - пользователю " + age + " лет");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать - пользователю " + age + " лет");
        }
        // Задача 2
        System.out.println("Задача 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу, его возраст - " + age + " лет");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет, его возраст - " + age + " лет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу, его возраст - " + age + " лет");
        }
        // Задача 3
        System.out.println("Задача 3");
        int seatsInTheTrain = 102;
        int seatingPlaces = 60;
        int seatOnTheTrain = 77;
        if (seatOnTheTrain <= seatingPlaces) {
            System.out.println("Сидячии места свободны");
        }
        if (seatOnTheTrain > seatingPlaces && seatOnTheTrain <= seatsInTheTrain) {
            System.out.println("Стоячии места свободны");
        }
        if (seatOnTheTrain > seatsInTheTrain) {
            System.out.println("Вагон уже полностью забит");
        }
        // ДЗ - 2
        // Задача 1
        System.out.println("Задача 1");
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием - пользователю " + age + " лет");
        }
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать - пользователю " + age + " лет");
        }
        // Задача 2
        System.out.println("Задача 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу, его возраст - " + age + " лет");
        }
        else if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет, его возраст - " + age + " лет");
        }
        else if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу, его возраст - " + age + " лет");
        }
        // Задача 3
        System.out.println("Задача 3");
        if (seatOnTheTrain <= seatingPlaces) {
            System.out.println("Сидячии места свободны");
        }
        else if (seatOnTheTrain > seatingPlaces && seatOnTheTrain <= seatsInTheTrain) {
            System.out.println("Стоячии места свободны");
        }
        else {
            System.out.println("Вагон уже полностью забит");
        }
        // ДЗ - 3
        // Задача 1
        System.out.println("Задача 1");
        int ageOfThePerson = 14;
        if (ageOfThePerson >= 2 && ageOfThePerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в детский сад");
        }
        else if (ageOfThePerson > 6 && ageOfThePerson <= 18) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в школу");
        }
        else if (ageOfThePerson > 18 && ageOfThePerson < 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в университет");
        }
        else if (ageOfThePerson > 24) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить на работу");
        }
        // Задача 2
        System.out.println("Задача 2");
        int ageOfTheChild = 7;
        if (ageOfTheChild < 5) {
            System.out.println("Возраст ребёнка " + ageOfTheChild + " - он не может кататься на аттракционе");
        }
        else if (ageOfThePerson > 5 && ageOfTheChild < 14) {
            System.out.println("Возраст ребёнка " + ageOfTheChild + " - он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else if (ageOfTheChild > 14) {
            System.out.println("Возраст ребёнка " + ageOfTheChild + " - он может кататься без сопровождения взрослого.");
        }
        // Задача 3
        System.out.println("Задача 3");
        int one = 44;
        int two = 33;
        int free = 55;
        if (one > two && one > free) {
            System.out.println(one);
        }
        else if (two > one && two > free) {
            System.out.println(two);
        }
        else {
            System.out.println(free);
        }
      }
    }