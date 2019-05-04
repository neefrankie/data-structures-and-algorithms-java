package chapter3;

class  ArraySelection {
    private long[] a;
    private int nElems;

    ArraySelection(int max) {
        a = new long[max];
        nElems = 0;
    }

    void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    void selectionSort() {
        int outerIndex;
        int innerIndex;
        int minIndex; // Point the the index of smallest element.

        for (outerIndex = 0; outerIndex < nElems-1; outerIndex++) {
            minIndex = outerIndex;
            for (innerIndex = outerIndex + 1; innerIndex < nElems; innerIndex++) {
                if (a[innerIndex] < a[minIndex]) { // If element at innerIndex is smaller than element at minIndex
                    minIndex = innerIndex;  // we have a new min
                }
            }
            swap(outerIndex, minIndex); // swap the smallest item in this round to the left.
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

public class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArraySelection arr;
        arr = new ArraySelection(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        arr.selectionSort();

        arr.display();
    }
}
