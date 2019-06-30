package chapter5.doublylinked;

public class DoublyLinkedList {
    private Link first;
    private Link last;

    DoublyLinkedList() {
        first = null;
        last = null;
    }

    boolean isEmpty() {
        return first == null;
    }

    void insertFirst(long dd) {
        Link newLink = new Link(dd);

        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }

        newLink.next = first;
        first = newLink;
    }

    void insertLast(long dd) {
        Link newLink = new Link(dd);

        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }

        last = newLink;
    }

    Link deleteFirst() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }

        first = first.next;
        return temp;
    }

    Link deleteLast() {
        Link temp = last;
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }

        last = last.previous;

        return temp;
    }

    boolean insertAfter(long key, long dd) {
        Link current = first;
        while (current.dData != key) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        Link newLink = new Link(dd);

        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }

        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    Link deleteKey(long key) {
        Link current = first;

        while (current.dData != key) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }

        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }

        return current;
    }

    void displayForward() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    void displayBackward() {
        System.out.print("List (last-->first): ");
        Link current = last;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }

        System.out.println();
    }
}
