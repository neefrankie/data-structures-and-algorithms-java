package chapter4.priorityq;

public class PriorityQueue {
    private int maxSize;
    private long[] queueArray;
    private int nItems;

    public PriorityQueue(int s) {
        maxSize = s;
        queueArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int i;

        if (nItems == 0) {
            queueArray[nItems++] = item;
        } else {
            for (i = nItems - 1; i >= 0; i--) {
                if (item > queueArray[i]) {
                    queueArray[i+1] = queueArray[i];
                } else {
                    break;
                }
            }
            queueArray[i+1] = item;
            nItems++;
        }
    }

    public long remove() {
        return queueArray[--nItems];
    }

    public long peekMin() {
        return queueArray[nItems-1];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }
}
