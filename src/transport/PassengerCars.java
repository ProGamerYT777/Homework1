package transport;

public class PassengerCars<T extends CategoryB> extends Transport implements Transport.Competing {

    private T categoryB;

    public PassengerCars(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public T getCategoryB() {
        return categoryB;
    }

    public void setCategoryB(T categoryB) {
        this.categoryB = categoryB;
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

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