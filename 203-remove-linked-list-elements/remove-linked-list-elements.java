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
    public ListNode removeElements(ListNode head, int val) {
      if(head == null){
        return head;
      }
      ListNode temp = new ListNode(0);
      temp.next = head;
      ListNode dummy = temp;
      while(dummy.next != null){
        if(dummy.next.val == val){
            dummy.next = dummy.next.next;
        }else{
            dummy = dummy.next;
        }   
      }
      return temp.next;
    }
}