package chapter11.hash;

public class HashTable {
    private DateItem[] hashArray;
    private int arraySize;
    private DateItem nonItem;

    public HashTable(int size) {
        arraySize = size;
        hashArray = new DateItem[arraySize];
        nonItem = new DateItem(-1);
    }

    public void displayTable() {
        System.out.print("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println();
    }

    public int hashFunc(int key) {
        return key % arraySize;
    }

    public void insert(DateItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item;
    }

    public DateItem delete(int key) {
        int hashVal = hashFunc(key);
        
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                DateItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }

        return null;
    }

    public DateItem find(int key) {
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal] != null) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= arraySize;
        }

        return null;
    }
}
