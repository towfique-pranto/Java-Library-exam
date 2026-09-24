public class LoanRecord {
    private Novel novel;
    private Librarian librarian;
    private double fine;

    LoanRecord(Novel novel, Librarian librarian) {
        this.novel = novel;
        this.librarian = librarian;
    }

    boolean setFine(double amount) {
        if (amount >= 0.0) {
            this.fine = amount;
            return true;
        } else {
            this.fine = -1.0;
            return false;
        }
    }

    String getRecord() {
        if (this.fine < 0.0) {
            return ("Unresolved");
        } else {
            return (this.novel.getTitle() + " managed by " + this.librarian.getName() + ": " + this.fine);
        }
    }
}