/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var rotateRight = function(head, k) {
    if(head == null || head.next == null || k == 0){
        return head;
    }
    let tail = head;
    length = 1;
    while(tail.next != null){
        tail = tail.next;
        length++;
    }
    tail.next = head;
    
    k %= length;
    if(k == 0){
        tail.next = null;
        return head;
    }
    let newtail = head;
    for(let i=0; i<length-k-1; i++){
        newtail = newtail.next;
    }
    let newHead = newtail.next;
    newtail.next = null;
    return newHead;
};