package chapter8.tree;

public class Node {
    public int key;
    public double val;
    public Node leftChild;
    public Node rightChild;

    public void displayNode() {
        System.out.print("{" + key + ", " + val + "} ");
    }
}
