public class Main {
    public static void main(String[] args) {
        Novel novel1 = new Novel("Good Novel", 445, "horror");
        Novel novel2 = new Novel("Bad Novel", 445, "comedy");
        Novel novel3 = new Novel("Average Novel", 445, "mystery");
        Novel novel4 = new Novel("My Novel", 445, "detective");

        Librarian librarian1 = new Librarian("Pranto");
        Librarian librarian2 = new Librarian("Shanto");

        Book [] book1 = new Book[4];
        book1[0] = novel1;
        book1[1] = novel2;
        book1[2] = novel3;
        book1[3] = novel4;

        for (int i = 0; i < 4; i++) {
            book1[i].displayInfo();
        }

        librarian1.addNovel(novel1);
        librarian1.addNovel(novel2);
        librarian2.addNovel(novel3);
        librarian2.addNovel(novel4);

        Shelf shelf1 = new Shelf("Wooden");
        Shelf shelf2 = new Shelf("Steel", 50);

        shelf1.displayShelf();
        shelf2.displayShelf();

        LoanRecord loanRecord1 = new LoanRecord(novel1, librarian1);
        LoanRecord loanRecord2 = new LoanRecord(novel3, librarian2);
        loanRecord1.setFine(40.0);
        loanRecord2.setFine(-10.0);

        System.out.println(loanRecord1.getRecord());
        System.out.println(loanRecord2.getRecord());

        librarian1.listNovels();
        librarian2.listNovels();
    }
}