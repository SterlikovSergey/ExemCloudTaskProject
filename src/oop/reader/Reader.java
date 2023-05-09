package oop.reader;

import javax.xml.crypto.Data;

public class Reader {
    private String surname;
    private int cardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String surname, int cardNumber, String faculty, String dateOfBirth, String phone) {
        this.surname = surname;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int books){
        System.out.println(this.surname + " took the books " + books + " things");
    }

    public void takeBook(String ...title){
        System.out.println(this.surname + " took books by title ");
        for (String i: title){
            System.out.println(i);
        }
    }
    public void takeBook(Book[] books){
        System.out.println(this.surname + " took the books ");
        for (Book i: books){
            System.out.println(i.getNameBook());
        }
    }
}
