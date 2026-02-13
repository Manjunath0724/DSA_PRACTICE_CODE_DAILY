package leetcode;

public class lt_83 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode i = head;
        ListNode j = head.next;
        while (i != null && j != null) {
            if (i.val != j.val) {
                i = i.next;
                j = j.next;
            } else {
                i.next = j.next;
                j = j.next; // move j forward safely
            }
        }
        return head;
    }

    public static void main(String[] args) {
        lt_83 sol = new lt_83();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = sol.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}


// public ListNode deleteDuplicates(ListNode head) {
//     ListNode current = head;
//     while (current != null && current.next != null) {
//         if (current.val == current.next.val) {
//             current.next = current.next.next; // skip duplicate
//         } else {
//             current = current.next;
//         }
//     }
//     return head;
// }