package Bog;

import java.util.ArrayList;

public class Bibliotek
{
    private ArrayList<Bog> books;


    public Bibliotek(ArrayList<Bog> books)
    {
        this.books = books;
    }


    public boolean isISBNNumberAlreadyExisting(Bog bookFour)
    {
        for (int i = 0; i < books.size(); i++)
        {
            if(books.get(i).getIsbnNumber() == bookFour.getIsbnNumber())
            {
                return true;
            }
        }

        return false;
    }

}
