package chapter5.addnumber;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);

        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = dummy;

        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            int sum = carry + x + y;

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);

            curr = curr.next;

            if (p != null) {
                p = p.next;
            }

            if (q != null) {
                q = q.next;
            }
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();

        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(2);

        list1.displayList();

        LinkedList list2 = new LinkedList();

        list2.insertFirst(4);
        list2.insertFirst(6);
        list2.insertFirst(5);

        list2.displayList();

        Solution solution = new Solution();

        ListNode sum = solution.addTwoNumbers(list1.getListNode(), list2.getListNode());

        ListNode current = sum;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }
}
