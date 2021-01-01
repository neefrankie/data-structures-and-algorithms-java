package chapter7.partition;

public class Partition {
    private long[] theArray;
    private int nElems;

    public Partition(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    int size() {
        return nElems;
    }

    void display() {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) {
            System.out.print(theArray[j] + " ");
        }

        System.out.println();
    }

    int partitionIt(int leftIndex, int rightIndex, long pivot) {
        int leftPtr = leftIndex - 1;
        int rightPtr = rightIndex + 1;

        while (true) {
            while (leftPtr < rightIndex && theArray[++leftPtr] < pivot) { }
            while (rightPtr > leftIndex && theArray[--rightPtr] > pivot) { }

            if (leftPtr >= rightPtr) {
                break;
            }

            swap(leftPtr, rightPtr);
        }

        return leftPtr;
    }

    void swap(int index1, int index2) {
        long temp = theArray[index1];
        theArray[index1] = theArray[index2];
        theArray[index2] = temp;
    }
}
