package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int numberOfSeats;
    private boolean tires;


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isTires() {
        return tires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, int registrationNumber, int numberOfSeats, boolean tires) {
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
        if (productionCountry == "" || productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == "" || color == null) {
            this.color = "White";
        } else {
            this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (transmission == "" || transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == "" || bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber <= 0 ) {
            this.registrationNumber = 100;
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.tires = tires;
    }

    public static boolean checkingTires(int month) {
    if (month == 11 || month == 12 || month == 1 || month == 2 || month == 3) {
     return true;
    } else {
        return false;
    }
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", numberOfSeats=" + numberOfSeats +
                ", tires=" + tires +
                '}';
    }
}
