package chapter5.iterator;

public class Link {
    long dData;
    Link next;

    Link(long dd) {
        dData = dd;
    }

    void displayLink() {
        System.out.print(dData + " ");
    }
}
