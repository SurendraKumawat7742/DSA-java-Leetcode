/**
 * Definition for singly-linked list.
 * public class ListListNode {
 *     int val;
 *     ListListNode next;
 *     ListListNode() {}
 *     ListListNode(int val) { this.val = val; }
 *     ListListNode(int val, ListListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
    //1st
    //    if(head == null || head.next == null){
    //     return head;
    //    }
    //    ListListNode temp = head.next;
    //    head.next = swapPairs(temp.next);
    //    temp.next = head;
    //    return temp;


    //2nd
        if(head==null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            ListNode nextListNode = curr.next;
            //swapping
            curr.next = nextListNode.next;
            nextListNode.next = curr;
            prev.next = nextListNode;
            //move forward
            prev = curr;
            curr = curr.next;
        }

        return dummy.next;
    }
}