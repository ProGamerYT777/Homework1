package transport;

public abstract class Transport{
    private String brand;
    private String model;
    private double engineCapacity;

    public abstract void startMoving();

    public abstract void finishTheMovement();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Transport(String brand, String model, double engineCapacity) {
        if (brand == "" || brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == "" || model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineCapacity <= 0) {
            this.engineCapacity = 1.5;
        } else {
            this.engineCapacity = engineCapacity;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    interface Competing {
        void pitStop();
        void bestLapTime();
        void maximumSpeed();

    }
}

