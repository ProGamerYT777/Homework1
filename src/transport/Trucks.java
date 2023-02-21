package transport;

public class Trucks extends Transport<CategoryC> implements Transport.Competing {


    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

    }

    public enum TypeOfLoadCapacity{
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);


        private Float typeOfLoadCapacityMin;
        private Float typeOfLoadCapacityMax;

        public Float getTypeOfLoadCapacityMin() {
            return typeOfLoadCapacityMin;
        }

        public Float getTypeOfLoadCapacityMax() {
            return typeOfLoadCapacityMax;
        }

        TypeOfLoadCapacity(Float typeOfLoadCapacityMin, Float typeOfLoadCapacityMax) {
            this.typeOfLoadCapacityMin = typeOfLoadCapacityMin;
            this.typeOfLoadCapacityMax = typeOfLoadCapacityMax;
        }

        @Override
        public String toString() {
            return "Грузоподъемность: от " + typeOfLoadCapacityMin + " тонн до " + typeOfLoadCapacityMax + " тонн";
        }
    }

    public Trucks(String brand, String model, double engineCapacity, TypeOfLoadCapacity typeOfLoadCapacity) {
        super(brand, model, engineCapacity);
        this.TypeOfLoadCapacity = typeOfLoadCapacity;
    }

    @Override
    public void getType() {

    }

    @Override
    public void printType() {
        System.out.println("Грузовой автомобиль");
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Грузовые автомобили могут проходить диагностику");
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

    @Override
    public String toString() {
        return "Trucks{" +
                " brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineCapacity=" + getEngineCapacity() + '\'' +
                ", TypeOfLoadCapacity=" + TypeOfLoadCapacity +
                '}';
    }
}