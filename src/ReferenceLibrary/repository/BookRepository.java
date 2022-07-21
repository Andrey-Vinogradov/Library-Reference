package ReferenceLibrary.repository;


import ReferenceLibrary.model.Book;

public class BookRepository {

    public Book[] books = { new Book("Alice in Wonderland","fantasy", 1865),
                            new Book("Dracula", "horror",1987),
                            new Book("The Little Prince","fantasy",1900 )};

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
