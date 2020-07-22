package chapter5.iterator;

public class LinkList {
    private Link first;

    LinkList() {
        first = null;
    }

    Link getFirst() {
        return first;
    }

    void setFirst(Link f) {
        first = f;
    }

    boolean isEmpty() {
        return first == null;
    }

    ListIterator getIterator() {
        return new ListIterator(this);
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
