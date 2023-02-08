package transport;

public class Buses<V extends CategoryD> extends Transport implements Transport.Competing {

    private V categoryD;

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

    }

    public Buses(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public V getCategoryD() {
        return categoryD;
    }

    public void setCategoryD(V categoryD) {
        this.categoryD = categoryD;
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
