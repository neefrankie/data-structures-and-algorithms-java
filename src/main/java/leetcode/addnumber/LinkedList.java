package leetcode.addnumber;

public class LinkedList {
    private ListNode first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int val) {
        ListNode newNode = new ListNode(val);

        newNode.next = first;

        first = newNode;
    }

    public ListNode getListNode() {
        return this.first;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        ListNode current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }

        System.out.println();
    }
}
