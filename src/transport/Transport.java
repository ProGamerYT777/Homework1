package transport;

public abstract class Transport<T extends Driver> {
    protected PassengerCars.BodyType BodyType;
    protected Trucks.TypeOfLoadCapacity TypeOfLoadCapacity;
    protected Buses.TypeOfCapacity TypeOfCapacity;
    private String brand;
    private String model;
    private double engineCapacity;
    private T driver;

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

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
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

    public abstract void getType();
    public abstract void printType();

    interface Competing {
        void pitStop();
        void bestLapTime();
        void maximumSpeed();
    }
        public abstract void passDiagnostics() throws TransportTypeException;
    }

