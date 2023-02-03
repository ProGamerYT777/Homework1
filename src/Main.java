import transport.Car;
import transport.Transport;
import transport.Bus;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Lada", "Granta", 2015, "Russia", "Yellow", 150);
        Bus bus2 = new Bus("Audi", "A8", 2020, "Germany", "Black", 200);
        Bus bus3 = new Bus("BMW", "Z8", 2021, "Germany", "Black", 250);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

    }
}