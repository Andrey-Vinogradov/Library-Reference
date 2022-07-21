package ReferenceLibrary.model;

public class Author {
    private String name;
    private String surname;
    private int yearofbirth;

    public Author(String name, String surname, int yearofbirth) {
        this.name = name;
        this.surname = surname;
        this.yearofbirth = yearofbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(int yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    public String getFullName(){
        return Author.this.name + " " + Author.this.surname;
    }

}
