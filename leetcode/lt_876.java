package leetcode;

public class lt_876 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        lt_876 sol = new lt_876();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode middle = sol.middleNode(head);
        System.out.println("Middle node value: " + middle.val);
    }
}

// That statement means:
// 👉 If the linked list has an odd number of nodes, return the exact middle
// node.
// 👉 If the linked list has an even number of nodes, return the second of the
// two middle nodes.
// Why the "second middle"?
// In an even-length list, there isn’t a single middle node. For example:
// - List: 1 → 2 → 3 → 4 → 5

// - Length = 5 (odd)
// - Middle = 3
// - List: 1 → 2 → 3 → 4 → 5 → 6
// - Length = 6 (even)
// - Middle nodes = 3 and 4
// - The problem statement says: return the second one → 4
