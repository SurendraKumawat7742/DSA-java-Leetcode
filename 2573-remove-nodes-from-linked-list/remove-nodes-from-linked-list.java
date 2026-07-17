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
    public ListNode reverseNodes(ListNode head){
    ListNode prev = null;
    ListNode curr = head;
    ListNode next = null;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

public ListNode removeNodes(ListNode head){
    head = reverseNodes(head);

    int max = 0;
    ListNode prev = null;
    ListNode curr = head;
    while(curr != null){
        max = Math.max(max , curr.val);

        if(max > curr.val){
            prev.next = curr.next;
            ListNode delete = curr;
            curr = curr.next;
            delete.next = null;
        }else{
            prev = curr;
            curr = curr.next;
        }
    }
    return reverseNodes(head);
}
}