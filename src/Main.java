import transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws TransportTypeException {
        PassengerCars car1 = new PassengerCars("BMW", "M5", 3.0, PassengerCars.BodyType.OFFROAD);
        PassengerCars car2 = new PassengerCars("BMW", "M2", 1.5, PassengerCars.BodyType.HATCHBACK);
        PassengerCars car3 = new PassengerCars("BMW", "M6", 4.0, PassengerCars.BodyType.SEDAN);
        PassengerCars car4 = new PassengerCars("BMW", "M3", 2.0, PassengerCars.BodyType.MINIVAN);


        Trucks truck1 = new Trucks("Mercedes", "Actros", 5.0, Trucks.TypeOfLoadCapacity.N2);
        Trucks truck2 = new Trucks("Mercedes", "Axor", 4.5, Trucks.TypeOfLoadCapacity.N1);
        Trucks truck3 = new Trucks("Mercedes", "Arocs", 5.0, Trucks.TypeOfLoadCapacity.N3);
        Trucks truck4 = new Trucks("Mercedes", "Atego", 5.5, Trucks.TypeOfLoadCapacity.N1);

        Buses bus1 = new Buses("PAZ", "3205", 2.0, Buses.TypeOfCapacity.SMALL);
        Buses bus2 = new Buses("PAZ", "4234", 2.5, Buses.TypeOfCapacity.BIG);
        Buses bus3 = new Buses("PAZ", "3204", 1.5, Buses.TypeOfCapacity.AVERAGE);
        Buses bus4 = new Buses("PAZ", "3206", 2.0, Buses.TypeOfCapacity.ESPECIALLYSMALL);

        Driver driver1 = new Driver("Ivanov Ivan Ivanovich", "Категория B", 10);
        Driver driver2 = new Driver("Petrov Peter Petrovich", "Категория С", 5);
        Driver driver3 = new Driver("Vasiliev Vasily Vasilyevich", "Категория D", 15);

        Mechanic mechanic1 = new Mechanic("Ivan Ivanov", "BMW");
        Mechanic mechanic2 = new Mechanic("Peter Petrov", "Mercedes");
        Mechanic mechanic3 = new Mechanic("Vasily Vasiliev", "PAZ");


        car1.pitStop();
        car1.bestLapTime();
        car1.maximumSpeed();

        truck1.pitStop();
        truck1.bestLapTime();
        truck1.maximumSpeed();

        bus1.pitStop();
        bus1.bestLapTime();
        bus1.maximumSpeed();

        System.out.println("Водитель " + driver1 + " управляет автомобилем " + car1 + " и будет участвовать в заезде");
        System.out.println("Водитель " + driver2 + " управляет автомобилем " + truck1 + " и будет участвовать в заезде");
        System.out.println("Водитель " + driver3 + " управляет автомобилем " + bus1 + " и будет участвовать в заезде");

        car1.printType();
        truck1.printType();
        bus1.printType();

        System.out.println(PassengerCars.BodyType.PICKUP);
        System.out.println(Trucks.TypeOfLoadCapacity.N2);
        System.out.println(Buses.TypeOfCapacity.BIG);

        car1.passDiagnostics();
        truck1.passDiagnostics();
//        bus1.passDiagnostics();

        List<String> transport = new ArrayList<>();
        transport.add("Легковые автомобили");
        transport.add("Грузовые автомобили");
        transport.add("Автобусы");
        System.out.println(transport);

        Queue<String> queueTransport = new LinkedList<>();
        queueTransport.offer("Легковые автомобили");
        queueTransport.offer("Грузовые автомобили");
        System.out.println(queueTransport);

        Map<Transport<?>, Mechanic> carAndMechanic = new HashMap<>();
        carAndMechanic.put(car1, mechanic1);
        carAndMechanic.put(truck1, mechanic2);
        carAndMechanic.put(bus1, mechanic3);
        carAndMechanic.put(car1, mechanic1);
        for (Map.Entry<Transport<?>, Mechanic> transport1 : carAndMechanic.entrySet()) {
            System.out.println(transport1.getKey() + " - " + transport1.getValue());
        }

        Set<String> drivers = new HashSet<>();
        drivers.add("Ivan");
        drivers.add("Peter");
        drivers.add("Vasily");
        drivers.add("Dmitry");
        drivers.add("Peter");
        Iterator<String> iterDrivers = drivers.iterator();
        while (iterDrivers.hasNext()) {
            System.out.println(iterDrivers.next());
        }
    }
}