package chapter5.sortedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListTest {

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
}