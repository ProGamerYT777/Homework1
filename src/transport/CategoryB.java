package transport;

public class CategoryB extends Driver implements Driver.Drivers {

    public CategoryB(String fullName, String driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void start() {
        System.out.println("Начать движение");
    }

    @Override
    public void stop() {
        System.out.println("Остановиться");
    }

    @Override
    public void refuelTheCar() {
        System.out.println("Заправить авто");
    }
}
