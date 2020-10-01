package ComIT.Practice7;

public class Book {

    private String title;
    private String author;
    private int availableCopies;
    private int loanedCopies;



    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies - loanedCopies;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public int getLoanedCopies() {
        return loanedCopies;
    }

    public boolean loan() {
        if (availableCopies > 0) {
            loanedCopies++;
            availableCopies--;
            System.out.println(title + " has been borrowed, there are currently " + availableCopies + " remaining.");
            return true;
        } else {
            System.out.println("There are no copies left");
            return false;
        }
    }

    public boolean bookReturn() {
        if (availableCopies <= loanedCopies) {
            availableCopies++;
            loanedCopies--;
            System.out.println(title + " has been returned, there are currently " + availableCopies + " remaining");
            return true;
        } else {
            System.out.println("There are currently no copies on loan");
        }
    return false; }

}
