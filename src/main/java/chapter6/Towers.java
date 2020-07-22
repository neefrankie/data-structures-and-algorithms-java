package chapter6;

public class Towers {
    static int nDisks = 4;

    public static void main(String[] args) {
        doTowers(nDisks, 'A', 'B', 'C');
    }

    // The problem is to find out which column should the first disk be placed.
    static void doTowers(int topN, char from, char inter, char to) {
        System.out.println("Enter (" + topN + " disks): s=" + from + ", i=" + inter + ", d=" + to);

        if (topN == 1) {
//            System.out.println("Disk 1 from " + from + " to " + to);
            System.out.println("Base case: move disk 1 from " + from + " to " + to);
        } else {

            doTowers(topN - 1, from, to, inter);

//            System.out.println("Disk " + topN + " from " + from + " to " + to);

            doTowers(topN - 1, inter, from, to);
        }

        System.out.println("Return (" + topN + " disk)");
    }
}
