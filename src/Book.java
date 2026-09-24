public class Book {
    private String title;
    private int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String getTitle() {
        return this.title;
    }

    int getPages() {
        return this.pages;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setPages(int pages) {
        if (pages < 50) {
            System.out.println("Invalid page number");
        } else {
            this.pages = pages;
        }
    }

    void displayInfo() {
        System.out.println("Title: " + this.title + ", Pages: " + this.pages);
    }
}