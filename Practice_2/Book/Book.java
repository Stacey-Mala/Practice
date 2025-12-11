package Practice_2.Book;

public class Book {

    // fields
    private String title;
    private String author;

    // constructor with arguments
    public Book(String someTitle, String someAuthor) {
        this.title = someTitle;
        this.author = someAuthor;
    }

    // getters for title and author fields
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }

    // setters to update title and author in an object
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    // print the info out
    public void printInfo() {
        System.out.println("Название книги: " + getTitle() + ", автор книги: " + getAuthor());
    }
}
