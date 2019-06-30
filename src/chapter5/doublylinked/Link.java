package chapter5.doublylinked;

class Link {
    long dData;
    Link next;
    Link previous;

    Link(long d) {
        dData = d;
    }

    void displayLink() {
        System.out.print(dData + " ");
    }
}
