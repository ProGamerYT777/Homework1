import transport.*;

public class Main {
    public static void main(String[] args) {
        PassengerCars<CategoryB> car1 = new PassengerCars<>("BMW",  "M5", 3.0);
        PassengerCars<CategoryB> car2 = new PassengerCars<>("BMW",  "M2", 1.5);
        PassengerCars<CategoryB> car3 = new PassengerCars<>("BMW",  "M6", 4.0);
        PassengerCars<CategoryB> car4 = new PassengerCars<>("BMW",  "M3", 2.0);


        Trucks<CategoryC> truck1 = new Trucks<>("Mercedes", "Actros",  5.0);
        Trucks<CategoryC> truck2 = new Trucks<>("Mercedes", "Axor",  4.5);
        Trucks<CategoryC> truck3 = new Trucks<>("Mercedes", "Arocs",  5.0);
        Trucks<CategoryC> truck4 = new Trucks<>("Mercedes", "Atego",  5.5);

        Buses<CategoryD> bus1 = new Buses<>("PAZ", "3205", 2.0);
        Buses<CategoryD> bus2 = new Buses<>("PAZ", "4234", 2.5);
        Buses<CategoryD> bus3 = new Buses<>("PAZ", "3204", 1.5);
        Buses<CategoryD> bus4 = new Buses<>("PAZ", "3206", 2.0);

        Driver driver1 = new Driver("Ivanov Ivan Ivanovich", "Категория B", 10);

        car1.pitStop();
        car1.bestLapTime();
        car1.maximumSpeed();

        System.out.println("Водитель " + driver1 + " управляет автомобилем " + car1 + " и будет участвовать в заезде");
    }
}