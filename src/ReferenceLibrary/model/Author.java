package ReferenceLibrary.model;

public class Author {
    private String nameAuthor;
    private String surname;
    private int yearOfBirth;

    public Author(String nameAuthor, String surname, int yearOfBirth) {
        this.nameAuthor = nameAuthor;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String name) {
        this.nameAuthor = nameAuthor;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getFullName(){
        return nameAuthor + " " + surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + nameAuthor + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
