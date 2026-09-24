public class Shelf {
    private String section;
    private int capacity;

    Shelf(String section) {
        this.section = section;
    }

    Shelf(String section, int capacity) {
        this.section = section;
        this.capacity = capacity;
    }

    void displayShelf() {
        System.out.println("Section: " + section + ", Capacity: " + capacity);
    }
}