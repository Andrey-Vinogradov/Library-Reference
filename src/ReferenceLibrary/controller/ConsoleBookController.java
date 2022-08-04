package ReferenceLibrary.controller;

import ReferenceLibrary.model.Author;
import ReferenceLibrary.model.Book;
import ReferenceLibrary.service.BookService;

public class ConsoleBookController {
    private BookService bookService = new BookService();

    public void getAll() {
        Book[] books = bookService.getAll();
        for (Book book : books) {
            //System.out.println(book.indexOf(i));
            System.out.println(book);
            //System.out.println(book.getAuthor().getFullName());
        }
    }


    public void createBook(String name, String genre, int yearRelease, Author author) {
        bookService.createBook(name,genre,yearRelease, author);
        System.out.println("Book with name " + name + " was created");
    }

    public Author createAuthor(String nameAuthor, String surname, int getYearOfBirth){
        Author author=bookService.createAuthor(nameAuthor, surname, getYearOfBirth);
        return author;

    }

    public void getByBookName(String bookName){
        Book book = bookService.getByBookName(bookName);
        System.out.println(String.format("Song with name [%s] was found", book.getName()));
    }
}
