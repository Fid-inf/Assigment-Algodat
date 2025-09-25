// Node Singly - Detektif Conan
class ConanBookNode {
    String title;
    ConanBookNode next;

    ConanBookNode(String title) {
        this.title = title;
        this.next = null;
    }
}

class ConanBookList {
    private ConanBookNode head;

    public void addBook(String title) {
        ConanBookNode newBook = new ConanBookNode(title);
        if (head == null) head = newBook;
        else {
            ConanBookNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newBook;
        }
    }

    public void display() {
        ConanBookNode temp = head;
        System.out.print("[Singly Linked List] ");
        while (temp != null) {
            System.out.print(temp.title + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Node Doubly - Wotakoi
class WotakoiBookNode {
    String title;
    WotakoiBookNode prev, next;

    WotakoiBookNode(String title) {
        this.title = title;
    }
}

class WotakoiBookList {
    private WotakoiBookNode head, tail;

    public void addBook(String title) {
        WotakoiBookNode newBook = new WotakoiBookNode(title);
        if (head == null) head = tail = newBook;
        else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public void displayForward() {
        WotakoiBookNode temp = head;
        System.out.print("[Doubly Linked List - Forward] ");
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        WotakoiBookNode temp = tail;
        System.out.print("[Doubly Linked List - Backward] ");
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}

// Node Circular - Sherlock Holmes
class SherlockBookNode {
    String title;
    SherlockBookNode next;

    SherlockBookNode(String title) {
        this.title = title;
    }
}

class SherlockBookList {
    private SherlockBookNode head, tail;

    public void addBook(String title) {
        SherlockBookNode newBook = new SherlockBookNode(title);
        if (head == null) {
            head = tail = newBook;
            tail.next = head;
        } else {
            tail.next = newBook;
            tail = newBook;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) return;
        SherlockBookNode temp = head;
        System.out.print("[Circular Linked List] ");
        do {
            System.out.print(temp.title + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}

// Main Program
public class MainStoryBooks {
    public static void main(String[] args) {
        // Singly Linked List - Detektif Conan
        ConanBookList conanBooks = new ConanBookList();
        conanBooks.addBook("The Kaito Kid Adventure");
        conanBooks.addBook("The Case of the Moonlight Sonata");
        conanBooks.addBook("The Scarlet School Trip");
        conanBooks.display();

        // Doubly Linked List - Wotakoi
        WotakoiBookList wotakoiBooks = new WotakoiBookList();
        wotakoiBooks.addBook("Love is Hard for Otaku");
        wotakoiBooks.addBook("Office Romance");
        wotakoiBooks.addBook("Gaming Life Stories");
        wotakoiBooks.displayForward();
        wotakoiBooks.displayBackward();

        // Circular Linked List - Sherlock Holmes
        SherlockBookList sherlockBooks = new SherlockBookList();
        sherlockBooks.addBook("A Study in Scarlet");
        sherlockBooks.addBook("The Sign of Four");
        sherlockBooks.addBook("The Hound of the Baskervilles");
        sherlockBooks.addBook("The Valley of Fear");
        sherlockBooks.display();
    }
}
