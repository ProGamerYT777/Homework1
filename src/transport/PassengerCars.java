package transport;

public class PassengerCars<T extends CategoryB> extends Transport implements Transport.Competing {

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

    }

    public PassengerCars(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга - 2 минуты");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость - 150 км/ч");
    }
}