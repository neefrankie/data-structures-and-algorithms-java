package chapter5.adt.queue;

class Link {
    long dData;
    Link next;

    Link(long d) {
        dData = d;
    }

    void displayLink() {
        System.out.print(dData + " ");
    }
}
