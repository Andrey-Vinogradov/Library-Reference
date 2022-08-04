package ReferenceLibrary;
import ReferenceLibrary.controller.ConsoleBookController;
import ReferenceLibrary.model.Author;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ConsoleBookController consoleBookController = new ConsoleBookController();
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your name: ");
        String myName = in.nextLine();
        System.out.println("Hello " + myName + "!!!");
        System.out.println(myName + " enter the number. What do you want to do? ");
        int num = 0;

        while (num != 4) {
            System.out.println("|*****************************|");
            System.out.println("| 1. Show a list of books     |");
            System.out.println("| 2. Add book to library      |");
            System.out.println("| 3. Remove book from library |");
            System.out.println("| 4. Exit                     |");
            System.out.println("|*****************************|");
            System.out.println();
            System.out.print(">- ");
            num = in.nextByte();
            if (num != 1 && num != 2 && num != 3 && num != 4) {
                System.out.println("error");
            }

            if (num == 1) {
                consoleBookController.getAll();
                System.out.println();
            }
            if (num == 2) {
                in.nextLine(); //перевод курсора в начало строки
                System.out.print("Please input name of book: ");
                String name = in.nextLine();
                System.out.print("Please input genre of book: ");
                String genre = in.nextLine();
                System.out.print("Please input year release of book: ");
                int yearRelease = in.nextInt();

                in.nextLine(); //перевод курсора в начало строки

                System.out.print("Please input name of author: ");
                String nameAuthor = in.nextLine();
                System.out.print("Please input surname of author: ");
                String surname = in.nextLine();
                System.out.print("Please year of birth of author: ");
                int yearOfBirth = in.nextInt();
                Author author= consoleBookController.createAuthor(nameAuthor,surname,yearOfBirth);
                consoleBookController.createBook(name,genre,yearRelease,author);

                //Author author = new Author(name, surname, yearOfBirth);
                //consoleBookController.addAuthorByBookName(bookName, author);
                consoleBookController.getAll();
            }
        }
    }
}


       //   consoleBookController.getAll();
       //   consoleBookController.getByBookName("Dracula");
       //  consoleBookController.create("Fish","meal",2022);
       //    consoleBookController.getAll();











