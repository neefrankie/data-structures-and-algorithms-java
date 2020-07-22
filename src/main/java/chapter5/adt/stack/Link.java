package chapter5.adt.stack;

class Link {
    long dData;
    Link next;

    Link(long dd) {
        dData = dd;
    }

    void displayLink() {
        System.out.print(dData + " ");
    }
}
