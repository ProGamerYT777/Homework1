package transport;

public class PassengerCars extends Transport<CategoryB> implements Transport.Competing {

    public PassengerCars(String brand, String model, double engineCapacity, BodyType bodyType) {
        super(brand, model, engineCapacity);
        this.BodyType = bodyType;
    }



    @Override
    public void getType() {

    }
    @Override
    public void printType() {
        System.out.println("Легковой автомобиль");
    }
    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбэк"),
        COMPARTMENT("Купе"),
        UNIVERSAL("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyType;

        public String getBodyType() {
            return bodyType;
        }

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + bodyType;
        }
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

    @Override
    public String toString() {
        return "PassengerCars{" +
                " brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineCapacity=" + getEngineCapacity() + '\'' +
                ", BodyType=" + BodyType +
                '}';
    }





    }