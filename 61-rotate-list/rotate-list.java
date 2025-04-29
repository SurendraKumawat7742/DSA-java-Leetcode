/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode tail = head;
        int length = 1;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        //Circular LinkedList
        tail.next = head;
        k %= length;
        if(k == 0){
            tail.next = null;//Undo circular
            return head;
        }
        //Find new tail (length-k-1 steps from head)
        ListNode newtail = head;
        for(int i=0; i<length - k - 1; i++){
            newtail = newtail.next;
        }

        ListNode newHead = newtail.next;
        newtail.next = null;
        return newHead;
    }
}
