package ReferenceLibrary.controller;

import ReferenceLibrary.model.Author;
import ReferenceLibrary.model.Book;
import ReferenceLibrary.service.BookService;

public class ConsoleBookController {
    private BookService bookService = new BookService();

    public void getAll() {
        Book[] books = bookService.getAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }


    public void create(String name, String genre, int yearRelease) {
        bookService.create(name,genre,yearRelease);
        System.out.println("Book with name " + name + " was created");
    }

    public void addAuthorByBookName(String bookName, Author author){
        bookService.addAuthorByBookName(bookName, author);
        System.out.println(String.format("Author [%s] was added to book [%s]", author.getName(), bookName));
    }

    public void getByBookName(String bookName){
        Book book = bookService.getByBookName(bookName);
        System.out.println(String.format("Song with name [%s] was found", book.getName()));
    }
}
