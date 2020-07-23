package chapter5.sortedlist;

class SortedList {

    private Link first;

    SortedList() {
        first = null;
    }

    // Used to sort an array.
    SortedList(Link[] linkArr) {
        first = null;
        for (Link link : linkArr) {
            insert(link);
        }
    }

    boolean isEmpty() {
        return first == null;
    }

    void insert(long key) {
        Link newLink = new Link(key);
        insert(newLink);
    }

    void insert(Link k) {
        Link previous = null;
        Link current = first;

        while(current != null && k.dData > current.dData) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = k;
        } else {
            previous.next = k;
        }

        k.next = current;
    }

    Link remove() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
