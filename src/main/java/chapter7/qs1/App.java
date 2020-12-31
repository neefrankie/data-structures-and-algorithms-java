package chapter7.qs1;

public class App {
    public static void main(String[] args) {
        int maxSize = 16;
        ArrayIns arr = new ArrayIns(maxSize);

        for (int j = 0; j < maxSize; j++) {
            long n = (int)(Math.random()*99);
            arr.insert(n);
        }

        arr.display();
        arr.quickSort();
        arr.display();
    }
}
