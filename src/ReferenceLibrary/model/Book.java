package ReferenceLibrary.model;

public class Book {
    private String name;
    private String genre;
    private int yearRelease;

    public Book(String name, String genre, int yearRelease) {
        this.name = name;
        this.genre = genre;
        this.yearRelease = yearRelease;
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

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }


}
