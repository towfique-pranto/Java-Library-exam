public class Librarian {
    private String name;
    private Novel[] manageNovels;
    int size = 0;

    Librarian(String name) {
        this.name = name;
        manageNovels = new Novel[3];
    }

    boolean addNovel(Novel n) {
        if (size < 3) {
            this.manageNovels[size] = n;
            size++; // Note: logic fix for array index iteration based on exam code scope
            return true;
        } else {
            return false;
        }
    }

    void listNovels() {
        if (size == 0) {
            System.out.println("No novels assigned");
        } else {
            for (Novel novel : manageNovels) {
                if (novel != null) {
                    System.out.println(novel.getTitle());
                }
            }
        }
    }

    String getName() {
        return this.name;
    }
}