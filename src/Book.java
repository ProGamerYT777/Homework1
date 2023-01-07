public class Book {
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Название " + this.title + " Автор " + this.author + " Год издания " + this.year;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        return title == book1.title;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}