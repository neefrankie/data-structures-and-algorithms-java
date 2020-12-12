package chapter7.shellsort;

public class ShellArray {
    private long[] theArray;
    private int nElems;

    public ShellArray(int max) {
        theArray = new long[max];
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

    public void shellSort() {
        int innerIndex, outerIndex;
        long temp;

        int h = 1;
        while (h <= nElems / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            System.out.println("Interval sequence: " + h);

            for (outerIndex = h; outerIndex < nElems; outerIndex++) {
                System.out.println("Outer index " + outerIndex);

                temp = theArray[outerIndex];
                innerIndex = outerIndex;

                while (innerIndex > h - 1 && theArray[innerIndex - h] >= temp) {
                    System.out.println("Inner index " + innerIndex);

                    theArray[innerIndex] = theArray[innerIndex - h];
                    innerIndex -= h;
                }
                theArray[innerIndex] = temp;
            }

            h = (h - 1) / 3;
        }
    }
}
