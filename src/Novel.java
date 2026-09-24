public class Novel extends Book {
    private String genre;

    Novel(String title, int pages, String genre) {
        super(title, pages);
        this.genre = genre;
    }

    @Override
    void displayInfo() {
        // super.displayInfo();
        System.out.println("Title: " + getTitle() + ", Pages: " + getPages() + ", Genre: " + this.genre);
    }

    String getGenre() {
        return this.genre;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }
}