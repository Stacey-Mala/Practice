package Practice_2.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("The Lord of the Rings", "J.R. Tolkin");

        book1.printInfo();
        book2.printInfo();

        // change the author
        System.out.println("Update!");
        book2.setAuthor("J.R. Tolkien");
        book2.printInfo();
    }

}
