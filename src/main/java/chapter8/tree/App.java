package chapter8.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        int value;
        Tree theThree = new Tree();

        theThree.insert(50, 1.5);
        theThree.insert(25, 1.2);
        theThree.insert(75, 1.7);
        theThree.insert(12, 1.5);
        theThree.insert(37, 1.2);
        theThree.insert(43, 1.7);
        theThree.insert(30, 1.5);
        theThree.insert(33, 1.2);
        theThree.insert(87, 1.7);
        theThree.insert(93, 1.5);
        theThree.insert(97, 1.5);

        while (true) {
            System.out.print("Enter first letter of show, ");
            System.out.print("insert, find, delete, or traverse: ");
            int choice = getChar();
            switch (choice) {
                case 's':
                theThree.displayTree();
                    break;

                case 'i':
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    theThree.insert(value, value + 0.9);
                    break;

                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theThree.find(value);
                    if (found != null) {
                        System.out.println("Found: ");
                        found.displayNode();
                        System.out.println();
                    } else {
                        System.out.print("Could not find " + value + "\n");
                    }
                    break;

                case 'd':
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theThree.delete(value);
                    if (didDelete) {
                        System.out.print("Deleted " + value + "\n");
                    } else {
                        System.out.print("Could not delete " + value + "\n");
                    }
                    break;

                case 't':
                    System.out.print("Enter type 1, 2, 3");
                    value = getInt();
                    switch (value) {
                        case 1:
                            theThree.traverse(TraverseType.PRE_ORDER);
                            break;

                        case 2:
                            theThree.traverse(TraverseType.IN_ORDER);
                            break;

                        case 3:
                            theThree.traverse(TraverseType.POST_ORDER);
                            break;

                        default:
                            System.out.println("Out of bounds");
                            break;
                    }
            }
        }
    }

    static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
