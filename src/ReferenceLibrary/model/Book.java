package ReferenceLibrary.model;

public class Book {
    private String name;
    private String genre;
    private int yearRelease;
    private Author author;

    public Book(String name, String genre, int yearRelease, Author author) {
        this.name = name;
        this.genre = genre;
        this.yearRelease = yearRelease;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
        public String toString() {
        String authorName = "";
        if (author != null) {
           authorName = author.getFullName();
        }
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", yearRelease=" + yearRelease +
                ", author=" + authorName +
                '}';
    }
}
