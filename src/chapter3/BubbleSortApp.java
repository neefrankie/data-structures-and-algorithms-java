package chapter3;

class ArrayBubble {
    private long[] a;
    private int nElems;

    ArrayBubble(int max) {
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

    void bubbleSort() {
        int out;
        int in;

        for (out = nElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    swap(in, in+1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}

class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBubble arr = new ArrayBubble(maxSize);

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

        arr.bubbleSort();

        arr.display();
    }
}
