import java.util.ArrayList;
import java.util.*;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
        books.add(new Book("Hard-Boiled Wonderland And The End Of The World", "Haruki Murakami"));
        books.add(new Book("A Bend in The River", "V.S. Naipaul"));
        books.add(new Book("Disgrace", "J. M. Coetzee"));
        books.add(new Book("Blood Meridian", "Cormac McCarthy"));
        books.add(new Book("My Struggle", "Karl Ove Knausgaard"));
        books.add(new Book("Finite And Infinite Games", "James P. Carse"));
        books.add(new Book("Impro", "Keith Johnstone"));
        books.add(new Book("Surely You're Joking, Mr. Feynman!", "Richard P. Feynman"));
        books.add(new Book("How To Win Friends & Influence People", "Dale Carnegie"));
        books.add(new Book("Fooled by Randomness", "Nassim Taleb"));
        books.add(new Book("Barbarian Days: A Surfing Life", "William Finnegan"));
    }

    public List<Book> displayBooks() {
        return books;
    }

    public boolean borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String title) {
        for(Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
                book.setCheckedOut(false);
                return true;
            }
        }
        return false;
    }
}
