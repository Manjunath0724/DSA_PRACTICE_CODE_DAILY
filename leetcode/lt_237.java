package leetcode;

public class lt_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        lt_237 obj = new lt_237();
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        obj.deleteNode(head.next);
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
