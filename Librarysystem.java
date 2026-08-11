class Library {
    private int booksIssued = 0;
    private static int totalSystemBooksIssued = 0;

    public void issueBook() {
        this.booksIssued++;
        totalSystemBooksIssued++;
    }

    public int getBooksIssued() {
        return this.booksIssued;
    }

    public static int getTotalSystemBooksIssued() {
        return totalSystemBooksIssued;
    }
}







public class Librarysystem {
    public static void main(String[] args) {
        Library central = new Library();
        Library seminar = new Library();

        central.issueBook();
        central.issueBook();
        seminar.issueBook();

        System.out.println("Central Library issued: " + central.getBooksIssued());
        System.out.println("Seminar Library issued: " + seminar.getBooksIssued());
        System.out.println("Total issued across both: " + Library.getTotalSystemBooksIssued());
    }
}
