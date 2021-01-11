package chapter8.tree;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public Node find(int key) {
        Node current = root;
        while (current.key != key) {
            if (key < current.key) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current == null) {
                return null;
            }
        }

        return current;
    }

    public void insert(int key, double val) {

        Node newNode = new Node();
        newNode.key = key;
        newNode.val = val;

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }


    public void traverse(TraverseType t) {
        switch (t) {
            case PRE_ORDER:
                System.out.print("\nPreorder traversal: ");
                break;

            case IN_ORDER:
                System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;

            case POST_ORDER:
                System.out.print("\nPostorder traversal: ");
                break;
        }

        System.out.println();
    }

    private void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.val + " ");
            inOrder(localRoot.rightChild);
        }
    }
}
