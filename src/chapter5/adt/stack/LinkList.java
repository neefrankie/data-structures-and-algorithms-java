package chapter5.adt.stack;

class LinkList {
    private Link first;

    LinkList() {
        first = null;
    }

    boolean isEmpty() {
        return first == null;
    }

    void insertFirst(long dd) {
        Link newLink = new Link(dd);
        newLink.next = first;
        first = newLink;
    }

    long deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp.dData;
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
