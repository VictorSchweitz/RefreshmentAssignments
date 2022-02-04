package Bog;

public class Bog
{
     private int isbnNumber;
     private String title;
     private int yearOfRelease;

    public Bog(int isbnNumber, String title, int yearOfRelease)
    {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public int getIsbnNumber()
    {
        return isbnNumber;
    }

    public String getTitle()
    {
        return title;
    }

    public int getYearOfRelease()
    {
        return yearOfRelease;
    }


    public void setIsbnNumber(int isbnNumber)
    {
        this.isbnNumber = isbnNumber;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setYearOfRelease(int yearOfRelease)
    {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString()
    {
        return "Bog{" +
                "isbnNumber=" + isbnNumber +
                ", title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
