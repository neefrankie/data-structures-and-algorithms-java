package chapter5.sortedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListTest {

    private Link[] linkArray(int size) {
        Link[] arr = new Link[size];

        for (int i = 0; i < size; i++) {
            int n = (int)(Math.random()*99);
            arr[i] = new Link(n);
        }

        return arr;
    }

    @Test
    public void sortedListApp() {
        SortedList theSortedList = new SortedList();

        theSortedList.insert(20);
        theSortedList.insert(40);

        theSortedList.displayList();

        theSortedList.insert(10);
        theSortedList.insert(30);
        theSortedList.insert(50);

        theSortedList.displayList();

        theSortedList.remove();

        theSortedList.displayList();
    }

    @Test
    public void listInsertionSort() {
        Link [] arr = linkArray(10);

        System.out.print("Unsorted array: ");
        for (Link link : arr) {
            System.out.print(link.dData + " ");
        }
        System.out.println();

        SortedList theSortedList = new SortedList(arr);

        for (int j = 0; j < arr.length; j++) {
            arr[j] = theSortedList.remove();
        }

        System.out.print("Sorted Array: ");
        for (Link link : arr) {
            System.out.print(link.dData);
        }
        System.out.println();
    }
}