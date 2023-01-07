public class Author {
    private String name;
    private String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    @Override
    public String toString() {
        return "Имя " + this.name + " Фамилия " + this.surname;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Author human1 = (Author) other;
        return name == human1.name;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}