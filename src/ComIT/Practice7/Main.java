package ComIT.Practice7;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("Tom Sawyer", "Mark Twain", 2);

        book.loan();
        book.loan();
        book.loan();
        book.bookReturn();
        book.bookReturn();
        book.bookReturn();
    }
}
