package chapter5.adt.stack;

class LinkStack {
    private LinkList theList;

    LinkStack() {
        theList = new LinkList();
    }

    void push(long j) {
        theList.insertFirst(j);
    }

    long pop() {
        return theList.deleteFirst();
    }

    boolean isEmpty() {
        return theList.isEmpty();
    }

    void displayStack() {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
}
