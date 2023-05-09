package oop.reader;

public class Book {
    private String title;
    private String authorBook;

    public String getNameBook() {
        return title;
    }

    public void setNameBook(String nameBook) {
        this.title = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public Book(String nameBook, String authorBook) {
        this.title = nameBook;
        this.authorBook = authorBook;
    }
}
