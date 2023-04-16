public class ReaderMain {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Petrov",155,"KSIS",
                "01.12.2010", "+375257406888" );
        Reader reader2 = new Reader("Ivanov", 125,"OPIP",
                "01.05.1999","+375297405533");
        Reader reader3 = new Reader("Washington", 298,
                "OPIP","11.01.2000","+375447888155");

        Book book1 = new Book("Terminator", "Jim Kerry");
        Book book2 = new Book("Angry birds", "Tim Cuk");

        Book[] books = new Book[]{book1,book2};

        reader1.takeBook(5);
        reader1.takeBook(books);
        reader1.takeBook(book1.getNameBook(),book2.getNameBook(),"New book");

    }
}
