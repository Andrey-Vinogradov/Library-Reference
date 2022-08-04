package ReferenceLibrary.service;

import ReferenceLibrary.model.Author;
import ReferenceLibrary.model.Book;
import ReferenceLibrary.repository.AuthorRepository;
import ReferenceLibrary.repository.BookRepository;

import java.util.Arrays;

public class BookService {

    private BookRepository bookRepository = new BookRepository();
    private AuthorRepository authorRepository = new AuthorRepository();

    public Book[] getAll() {
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
    public Author createAuthor(String nameAuthor, String surname, int yearOfBirth){
        Author newAuthor = new Author(nameAuthor,surname,yearOfBirth);
        Author[] newAuthors = Arrays.copyOf(authorRepository.getAuthors(), authorRepository.getAuthors().length +1);
        newAuthors[newAuthors.length -1] = newAuthor;
        authorRepository.setAuthors(newAuthors);
        return newAuthor;
    }

    public void createBook(String name, String genre, int yearRelease, Author author) {
        Book newBook = new Book(name, genre, yearRelease, author);
        Book[] newBooks = Arrays.copyOf(bookRepository.getBooks(), bookRepository.getBooks().length + 1);
        newBooks[newBooks.length - 1] = newBook;
        bookRepository.setBooks(newBooks);
    }

    }



