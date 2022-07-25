package ReferenceLibrary;

import ReferenceLibrary.controller.ConsoleBookController;

public class Main {
    public static void main(String[] args) {
        ConsoleBookController consoleBookController = new ConsoleBookController();

     //   consoleBookController.getAll();
     //   consoleBookController.getByBookName("Dracula");
        consoleBookController.create("Fish","meal",2022);
        consoleBookController.getAll();
    }
}
