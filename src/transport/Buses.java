package transport;

public class Buses extends Transport<CategoryD> implements Transport.Competing {


    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

    }

    public enum TypeOfCapacity {
        ESPECIALLYSMALL(null, 10),
        SMALL(10,25),
        AVERAGE(25,50),
        BIG(50,80),
        ESPECIALLYBIG(80,120);

        private Integer typeOfCapacityMin;
        private Integer typeOfCapacityMax;

        public Integer getTypeOfCapacityMin() {
            return typeOfCapacityMin;
        }

        public Integer getTypeOfCapacityMax() {
            return typeOfCapacityMax;
        }

        TypeOfCapacity(Integer typeOfCapacityMin, Integer typeOfCapacityMax) {
            this.typeOfCapacityMin = typeOfCapacityMin;
            this.typeOfCapacityMax = typeOfCapacityMax;
        }

        @Override
        public String toString() {
            return "Вместимость: " + typeOfCapacityMin + " — " + typeOfCapacityMax + " мест";
        }
    }

    public Buses(String brand, String model, double engineCapacity, TypeOfCapacity typeOfCapacity) {
        super(brand, model, engineCapacity);
        this.TypeOfCapacity = typeOfCapacity;
    }

    @Override
    public void getType() {

    }

    @Override
    public void printType() {
        System.out.println("Автобус");
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

    @Override
    public String toString() {
        return "Buses{" +
                " brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineCapacity=" + getEngineCapacity() + '\'' +
                ", TypeOfCapacity=" + TypeOfCapacity +
                '}';
    }
}
