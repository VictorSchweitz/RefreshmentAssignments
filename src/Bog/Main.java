package Bog;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        ArrayList<Bog> books = new ArrayList<>();



        Bog bookOne = new Bog(123, "Java 101", 1998);
        Bog bookTwo = new Bog(1234, "Java 202", 2003);
        Bog bookThree = new Bog(1235, "Java 303", 2008);

        Bog bookFour = new Bog(123, "Java 404", 2013);
        Bog bookFive = new Bog(123456, "Java 505", 2018);

        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);


        Bibliotek bibliotek = new Bibliotek(books);


        System.out.println(books);

        System.out.println(bibliotek.isISBNNumberAlreadyExisting(bookFour));
    }
}
