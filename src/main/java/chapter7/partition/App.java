package chapter7.partition;

public class App {
    public static void main(String[] args) {
        int maxSize = 16;
        Partition arr = new Partition(maxSize);

        for (int j = 0; j < maxSize; j++) {
            long n = (int)(Math.random()*199);
            arr.insert(n);
        }
        arr.display();

        long pivot = 99;
        System.out.print("Pivot is " + pivot);
        int size = arr.size();

        int partIndex = arr.partitionIt(0, size - 1, pivot);

        System.out.println(", Partition is at index " + partIndex);
        arr.display();
    }
}
