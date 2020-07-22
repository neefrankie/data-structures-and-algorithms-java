package leetcode.addnumber;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void displayNode() {
        System.out.print(val + " ");
    }

    static public void displayAll(ListNode n) {
        if (n == null) {
            return;
        }

        n.displayNode();

        displayAll(n.next);
    }
}
