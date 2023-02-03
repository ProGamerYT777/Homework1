package transport;

public class Car extends Transport{
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int numberOfSeats;
    private boolean tires;

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
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

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, String bodyType, int numberOfSeats) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
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
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", numberOfSeats=" + numberOfSeats +
                ", tires=" + tires +
                '}';
    }
}
