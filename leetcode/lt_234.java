package leetcode;

public class lt_234 {
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

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null, curr = slow;
        while (curr != null) {

            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        ListNode first = head, second = prev;
        while (second != null) {
            if (first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        return true;
    }

    public static void main(String[] args) {
        lt_234 sol = new lt_234();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);
        boolean result = sol.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}


// /** another method to solve the question take an array and then add the numbers one by one to array and then compare the first and last element of the array simultenously and increase left and decreese right if yes then true or false
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     static int[] mirror = new int[100000];

//     public boolean isPalindrome(ListNode head) {

//         int i = 0, l = 0;
//         while (head != null) {
//             mirror[i++] = head.val;
//             head = head.next;
//         }

//         while (i > 0) {
//             if (mirror[l++] != mirror[--i])
//                 return false;
//         }
//         return true;
//     }
// }