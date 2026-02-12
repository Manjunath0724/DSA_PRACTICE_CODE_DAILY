package leetcode;

public class lt_160 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode pA = headA;
        ListNode pB = headB;

        // Traverse both lists. When one pointer reaches the end,
        // redirect it to the other list's head.
        while (pA != pB) {
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }

        // Either both are null (no intersection) or both point to intersection node
        return pA;

        // Each step in the while (pA != pB) loop is one iteration.
        // - Start: pA=1, pB=4 (not equal) → iteration 1
        // - Next: pA=2, pB=5 → iteration 2
        // - Next: pA=3, pB=8 → iteration 3
        // - Next: pA=8, pB=9 → iteration 4
        // - Next: pA=9, pB=null → iteration 5
        // - Next: pA=null → 4, pB=1 → iteration 6
        // - Next: pA=4, pB=2 → iteration 7
        // - Next: pA=5, pB=3 → iteration 8
        // - Next: pA=8, pB=8 → equal → loop ends

    }

    public static void main(String[] args) {
        lt_160 sol = new lt_160();
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        ListNode intersection = new ListNode(8);
        headA.next.next = intersection;
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = intersection;

        ListNode result = sol.getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}
// Approach 2: Length Difference Method
// Time Complexity: O(m + n) where m and n are the lengths of the two linked
// lists. // Space Complexity: O(1) since we are using only a constant amount of
// extra space.

// public ListNode getIntersectionNodeLengthDiff(ListNode headA, ListNode headB)
// {
// int lenA = getLength(headA);
// int lenB = getLength(headB);

// // Give the longer list a head start
// while (lenA > lenB) {
// headA = headA.next;
// lenA--;
// }
// while (lenB > lenA) {
// headB = headB.next;
// lenB--;
// }

// // Move simultaneously until intersection or null
// while (headA != headB) {
// headA = headA.next;
// headB = headB.next;
// }

// return headA;
// }

// // Helper function for Approach 2
// private int getLength(ListNode node) {
// int length = 0;
// while (node != null) {
// length++;
// node = node.next;
// }
// return length;
// }
// }