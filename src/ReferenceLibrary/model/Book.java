package ReferenceLibrary.model;

public class Book {
    private String name;
    private String genre;
    private int yearrelease;

    public Book(String name, String genre, int yearrelease) {
        this.name = name;
        this.genre = genre;
        this.yearrelease = yearrelease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearrelease() {
        return yearrelease;
    }

    public void setYearrelease(int yearrelease) {
        this.yearrelease = yearrelease;
    }


}
