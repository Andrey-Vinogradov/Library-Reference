package ReferenceLibrary.service;

import ReferenceLibrary.model.Author;
import ReferenceLibrary.model.Book;
import ReferenceLibrary.repository.BookRepository;

import java.util.Arrays;

public class BookService {

    private BookRepository bookRepository = new BookRepository();

    public Book[] getAll(){
        return bookRepository.getBooks();
    }
    public Book getByBookName(String name){

        for (int i = 0; i < bookRepository.getBooks().length; i++) {
            if (bookRepository.getBooks()[i].getName().equals(name)){
                return bookRepository.getBooks()[i];
            }
        }
        return null;
    }
    public void addAuthorByBookName(String bookName, Author author){
        Book book = getByBookName(bookName);
        book.setAuthor(author);
    }
    public void create(String name, String genre, int yearRelease){
        Book newBook = new Book(name, genre, yearRelease);
        Book[] newBooks = Arrays.copyOf(bookRepository.getBooks(), bookRepository.getBooks().length +1);
        newBooks[newBooks.length - 1] = newBook;
        bookRepository.setBooks(newBooks);
    }

}

