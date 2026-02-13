package leetcode;

public class lt_21 {
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();// LL created to return
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 == null) {
            curr.next = l2;
        } else if (l2 == null) {
            curr.next = l1;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        lt_21 sol = new lt_21();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = sol.mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

// Recursive approach
 // if(l1==null){
        //     return l2;
        // }
        // if(l2==null){
        //     return l1;
        // }
        // if(l1.val<l2.val){
        //     l1.next=mergeTwoLists(l1.next,l2);
        //     return l1;
        // }
        // else{
        //     l2.next=mergeTwoLists(l1,l2.next);
        // }
        //     return l2;