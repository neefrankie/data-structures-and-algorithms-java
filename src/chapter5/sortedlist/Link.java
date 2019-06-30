package chapter5.sortedlist;

class Link {
    public long dData;
    public Link next;

    Link(long dd) {
        dData = dd;
    }

    void displayLink() {
        System.out.print(dData + " ");
    }
}
