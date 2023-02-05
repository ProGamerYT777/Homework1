package transport;

public class Trucks extends Transport implements Transport.Competing {

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

    }

    public Trucks(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга - 4 минуты");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость - 90 км/ч");
    }
}
