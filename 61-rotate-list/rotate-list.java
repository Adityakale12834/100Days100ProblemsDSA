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
        if(k < 1 || head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            length++;
            temp = temp.next;
        }
        temp.next = head;
        int location = k % length;
        ListNode temp1 = head;
        int n = length - location; 
        ListNode newLast= head; //one step before the rotaiton begins = newLast
        for(int i=0; i< n - 1 ; i++){ // newLast will be our new tail, so reaching till there
            newLast= newLast.next;
        }
        head= newLast.next; // newLast.next will be our new head.
        newLast.next = null; //now point newLast.next = null as newLast is our tail now.
        
        return head; // return head.

    }
}