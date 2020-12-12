package chapter7.shellsort;

public class ShellSortApp {
    public static void main(String[] args) {
        int maxSize = 10;
        ShellArray arr = new ShellArray(maxSize);

        for (int j = 0; j < maxSize; j++) {
            long n = (int)(Math.random()*99);
            arr.insert(n);
        }

        arr.display();
        arr.shellSort();
        arr.display();
    }
}
