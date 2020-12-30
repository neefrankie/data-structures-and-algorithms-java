package chapter7.qs2;

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

    private void recQuickSort(int leftIndex, int rightIndex) {
        int size = rightIndex - leftIndex + 1;
        if (size <= 3) {
            manualSort(leftIndex, rightIndex);
        } else {
            long median = medianOf3(leftIndex, rightIndex);
            int partition =partitionIt(leftIndex, rightIndex, median);
            recQuickSort(leftIndex, partition - 1);
            recQuickSort(partition + 1, rightIndex);
        }
    }

    private int partitionIt(int leftIndex, int rightIndex, long pivot) {
        int leftPtr = leftIndex;
        int rightPtr = rightIndex -1;

        while (true) {
            while (theArray[++leftPtr] < pivot) {}
            while (theArray[--rightPtr] > pivot) {}

            if (leftPtr >= rightPtr) {
                break;
            }else {
                swap(leftPtr, rightPtr);
            }
        }

        swap(leftPtr, rightIndex-1);
        return leftPtr;
    }

    private long medianOf3(int leftIndex, int rightIndex) {
        int centerIndex = (leftIndex + rightIndex) / 2;

        if (theArray[leftIndex] > theArray[centerIndex]) {
            swap(leftIndex, centerIndex);
        }

        if (theArray[leftIndex] > theArray[rightIndex]) {
            swap(leftIndex, rightIndex);
        }

        if (theArray[centerIndex] > theArray[rightIndex]) {
            swap(centerIndex, rightIndex);
        }

        swap(centerIndex, rightIndex- 1);
        return theArray[rightIndex - 1];
    }

    private void manualSort(int leftIndex, int rightIndex) {
        int size = rightIndex - leftIndex + 1;
        if (size <= 1) {
            return;
        }

        if (size == 2) {
            if (theArray[leftIndex] > theArray[rightIndex]) {
                swap(leftIndex, rightIndex);
            }

            return;
        }

        if (theArray[leftIndex] > theArray[rightIndex - 1]) {
            swap(leftIndex, rightIndex - 1);
        }

        if (theArray[leftIndex] > theArray[rightIndex]) {
            swap(leftIndex, rightIndex);
        }

        if (theArray[rightIndex - 1] > theArray[rightIndex]) {
            swap(rightIndex - 1, rightIndex);
        }
    }

    private void swap(int index1, int index2) {
        long temp = theArray[index1];
        theArray[index1] = theArray[index2];
        theArray[index2] = temp;
    }
}
