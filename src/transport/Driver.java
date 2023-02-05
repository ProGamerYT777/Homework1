package transport;

public class Driver {
    private String fullName;
    private String driverLicense;
    private int experience;

    public String getFullName() {
        return fullName;
    }

    public String isDriverLicense() {
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(String fullName, String driverLicense, int experience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", driverLicense=" + driverLicense +
                ", experience=" + experience +
                '}';
    }

    interface Drivers {
        void start();
        void stop();
        void refuelTheCar();
    }
}
