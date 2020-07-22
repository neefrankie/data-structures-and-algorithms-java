package chapter3;

class ArrayInsert {
    private long[] a;
    private int nElems;

    ArrayInsert(int max) {
        a= new long[max];
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

    void insertionSort() {
        int innerIndex;
        int outerIndex;

        for (outerIndex = 1; outerIndex < nElems; outerIndex++) {
            System.out.println("=========== Round " + outerIndex + " =============");

            long temp = a[outerIndex];
            System.out.println("Remove marked item " + temp + " at " + outerIndex);

            innerIndex = outerIndex;
            System.out.println("Start shift at position " + innerIndex);

            while (innerIndex > 0 && a[innerIndex - 1] >= temp) {
                System.out.println("Find item at " + (innerIndex - 1) + " larger than marker. Shift to right");
                a[innerIndex] = a[innerIndex - 1];
                --innerIndex;
            }
            a[innerIndex] = temp;
            System.out.println("Inserted marked item at " + innerIndex);

            System.out.println("Now items are:");

            display();
        }
    }
}

public class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInsert arr;
        arr = new ArrayInsert(maxSize);

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

        arr.insertionSort();

        arr.display();
    }
}
