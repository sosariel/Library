import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
            System.out.println("\nWelcome to the Library!\nPlease select an option (1-4):\n1. Show available books\n2. Borrow book\n3. Return book\n4. Exit");
            String userInput = scanner.nextLine();
            if("1".equals(userInput)){
                System.out.println("List of available books:");
                for (Book book : library.displayBooks()) {
                    System.out.println(book);
                }
            } else if ("2".equals(userInput)) {
                System.out.println("Enter the title of a book: ");
                String titleToBorrow = scanner.nextLine();
                if (library.borrowBook(titleToBorrow)) {
                    System.out.println("Enjoy your book!");
                } else {
                    System.out.println("Book not in stock");
                }
            } else if ("3".equals(userInput)) {
                System.out.println("Enter the title of a book: ");
                String titleToReturn = scanner.nextLine();
                if (library.returnBook(titleToReturn)) {
                    System.out.println("Thanks for returning the book!");
                } else {
                    System.out.println("Book does not belong to library");
                }
            } else if ("4".equals(userInput)) {
                running = false;
            } else {
                System.out.println("Please select a valid option");
            }
        }
        scanner.close();
    }
}
