package chapter11.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        DateItem dataItem;
        int key, size, n, keysPerCell;
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of item: ");
        n = getInt();
        keysPerCell = 10;

        HashTable theHashTable = new HashTable(size);

        for (int j = 0; j < n; j++) {
            key = (int)(java.lang.Math.random() * keysPerCell * size);
            dataItem = new DateItem(key);
            theHashTable.insert(dataItem);
        }

        while (true) {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = getChar();

            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;

                case 'i':
                    System.out.print("Enter key value to insert: ");
                    key = getInt();
                    dataItem = new DateItem(key);
                    theHashTable.insert(dataItem);
                    break;

                case 'd':
                    System.out.print("Enter key value to delete: ");
                    key = getInt();
                    theHashTable.delete(key);
                    break;

                case 'f':
                    System.out.print("Enter key value to find: ");
                    key = getInt();
                    dataItem = theHashTable.find(key);
                    if (dataItem != null) {
                        System.out.println("Found " + key);
                    } else {
                        System.out.println("Could not find " + key);
                    }
                    break;

                default:
                    System.out.print("Invalid entry\n");
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
