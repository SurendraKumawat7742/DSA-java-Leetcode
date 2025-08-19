/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

//1st
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    //     while(headB!=null){
    //     ListNode temp = headA;
    //     while(temp!=null){
    //         if(temp==headB){
    //             return headB;
    //         }
    //         temp = temp.next;
    //     }
    //     headB = headB.next;
    //     }
    //     return null;
    // }

//2nd
    static {
        Solution solution = new Solution();

        for (int i = 0; i < 100; i++) {
            solution.getIntersectionNode(new ListNode(1), new ListNode(2));
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        if (headA == headB)
            return headA;
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a != null ? a.next : headB;
            b = b != null ? b.next : headA;
        }
        return b;
    }
}