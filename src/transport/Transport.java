package transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    List<String> mechanics = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineCapacity, engineCapacity) == 0 && BodyType == transport.BodyType && TypeOfLoadCapacity == transport.TypeOfLoadCapacity && TypeOfCapacity == transport.TypeOfCapacity && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver) && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BodyType, TypeOfLoadCapacity, TypeOfCapacity, brand, model, engineCapacity, driver, mechanics);
    }
}



