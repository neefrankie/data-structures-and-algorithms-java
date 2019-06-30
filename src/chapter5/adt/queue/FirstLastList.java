package chapter5.adt.queue;

public class FirstLastList {
    private Link first;
    private Link last;

    FirstLastList() {
        first = null;
        last = null;
    }

    boolean isEmpty() {
        return first == null;
    }

    void insertLast(long dd) {
        Link newLink = new Link(dd);

        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }

        last = newLink;
    }

    long deleteFirst() {
        long temp = first.dData;
        if (first.next == null) {
            last = null;
        }

        first = first.next;
        return temp;
    }

    void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }

        System.out.println();
    }
}
