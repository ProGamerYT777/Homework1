public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Holidays", "Ivan Ivanov", 2010);
        System.out.println("book1.title = " + book1.getTitle());
        System.out.println("book1.author = " + book1.getAuthor());
        System.out.println("book1.year = " + book1.getYear());
        Book book2 = new Book("Weekend", "Andrey Andreev", 1995);
        System.out.println("book2.title = " + book2.getTitle());
        System.out.println("book2.author = " + book2.getAuthor());
        System.out.println("book2.year = " + book2.getYear());
        Author human1 = new Author("Ivan", "Ivanov");
        System.out.println("human1.name = " + human1.getName());
        System.out.println("human1.surname = " + human1.getSurname());
        Author human2 = new Author("Andrey", "Andreev");
        System.out.println("human2.name = " + human2.getName());
        System.out.println("human2.surname = " + human2.getSurname());
        book2.setYear(2020);
        System.out.println("book2.getYear() = " + book2.getYear());

    }
}