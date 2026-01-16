package practice3.Library;

public class LibraryTest {
    public static void main(String[] args) {
        Library book = new Library();

        System.out.println("Access through setters and getters:");
        System.out.println();
        book.setBookTitle("Java");
        System.out.println("Title: " + book.getBookTitle());
        book.setAuthor("James Gosling");
        System.out.println("Author: " + book.getAuthor());
        book.setYear(1996);
        System.out.println("Year: " + book.getYear());
        book.setCategory("Si-Fi");
        System.out.println("Category: " + book.getCategory());

        System.out.println();
        System.out.println("Direct access:");
        System.out.println();
        // book.bookTitle = "JS"; // not allowed
        System.out.println("Title: " + book.getBookTitle());
        book.author = "Ryan Gosling";
        System.out.println("Author: " + book.getAuthor());
        book.year = 2025;
        System.out.println("Year: " + book.getYear());
        book.category = "Fairytale";
        System.out.println("Category: " + book.getCategory());
    }
}
