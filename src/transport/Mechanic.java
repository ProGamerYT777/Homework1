package transport;


import java.util.Objects;

public class Mechanic {
    private String nameAndSurname;
    private String company;

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Mechanic(String nameAndSurname, String company) {
        this.nameAndSurname = nameAndSurname;
        this.company = company;
    }

    public void performMaintenance() {
        System.out.println("Провести техобслуживание");
    }

    public void fixTheCar() {
        System.out.println("Починить машину");
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(nameAndSurname, mechanic.nameAndSurname) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAndSurname, company);
    }
}

