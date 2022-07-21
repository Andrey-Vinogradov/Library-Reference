package ReferenceLibrary.Service;

import ReferenceLibrary.model.Author;
import ReferenceLibrary.model.Book;
import ReferenceLibrary.repository.BookRepository;

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
        Author author =
        //book.setAuthor(author);
    }
}

