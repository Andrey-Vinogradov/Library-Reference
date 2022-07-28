package ReferenceLibrary.repository;


import ReferenceLibrary.model.Book;

import java.util.Arrays;


public class BookRepository {
    private AuthorRepository authorRepository = new AuthorRepository();

    private Book[] books = { new Book("Alice in Wonderland","fantasy", 1865, authorRepository.getAuthors()[0]),
                            new Book("Dracula", "horror",1987, authorRepository.getAuthors()[1]),
                            new Book("The Little Prince","fantasy",1900, authorRepository.getAuthors()[2] )};

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }


}
