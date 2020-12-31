package chapter7.qs1;

class ArrayIns {
    private long[] theArray;
    private int nElems;

    public ArrayIns(int max) {
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        theArray[nElems] = value;
        nElems++;
    }

    public void display() {
        System.out.print("A=");
        for (int j = 0; j < nElems; j++) {
            System.out.print(theArray[j] + " ");
        }
        System.out.println();
    }

    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }

    public void recQuickSort(int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex <= 0) {
            return;
        }

        long pivot = theArray[rightIndex];

        int partition = partitionIt(leftIndex, rightIndex, pivot);
        recQuickSort(leftIndex, partition - 1);
        recQuickSort(partition + 1, rightIndex);
    }

    public int partitionIt(int leftIndex, int rightIndex, long pivot) {
        int leftPtr = leftIndex - 1;
        int rightPtr = rightIndex;
        while (true) {
            while (theArray[++leftPtr] < pivot) { }
            while (rightPtr > 0 && theArray[--rightPtr] > pivot) { }

            if (leftPtr >= rightPtr) {
                break;
            }

            swap(leftPtr, rightPtr);
        }

        swap(leftPtr, rightIndex);

        return leftPtr;
    }

    public void swap(int index1, int index2) {
        long temp = theArray[index1];
        theArray[index1] = theArray[index2];
        theArray[index2] = temp;
    }
}
