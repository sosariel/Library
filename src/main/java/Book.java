public class Book {

    private String title;
    private String author;
    private boolean checkedOut;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    @Override
    public String toString() {
        return String.format("Title: %-50s Author: %-26s Checked Out: %-5s", title, author, checkedOut);
    }

}
