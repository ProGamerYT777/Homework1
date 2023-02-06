package transport;

public class Buses<T extends CategoryD> extends Transport implements Transport.Competing {

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

    }

    public Buses(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга - 3 минуты");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость - 100 км/ч");
    }
}
