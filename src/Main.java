import transport.Buses;
import transport.Driver;
import transport.PassengerCars;
import transport.Trucks;

public class Main {
    public static void main(String[] args) {
        PassengerCars car1 = new PassengerCars("BMW",  "M5", 3.0);
        PassengerCars car2 = new PassengerCars("BMW",  "M2", 1.5);
        PassengerCars car3 = new PassengerCars("BMW",  "M6", 4.0);
        PassengerCars car4 = new PassengerCars("BMW",  "M3", 2.0);

        Trucks truck1 = new Trucks("Mercedes", "Actros",  5.0);
        Trucks truck2 = new Trucks("Mercedes", "Axor",  4.5);
        Trucks truck3 = new Trucks("Mercedes", "Arocs",  5.0);
        Trucks truck4 = new Trucks("Mercedes", "Atego",  5.5);

        Buses bus1 = new Buses("PAZ", "3205", 2.0);
        Buses bus2 = new Buses("PAZ", "4234", 2.5);
        Buses bus3 = new Buses("PAZ", "3204", 1.5);
        Buses bus4 = new Buses("PAZ", "3206", 2.0);

        Driver driver1 = new Driver("Ivanov Ivan Ivanovich", "Категория B", 10);

        car1.pitStop();
        car1.bestLapTime();
        car1.maximumSpeed();

        System.out.println("Водитель " + driver1 + " управляет автомобилем " + car1 + " и будет участвовать в заезде");

    }
}