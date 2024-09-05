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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode Node : lists){
            if(Node != null){
                pq.add(Node);
                // System.out.println(temp.val);
            }
        }
        ListNode Final = new ListNode(-1);
        ListNode finDemo = Final;
        while(!pq.isEmpty()){
            finDemo.next = pq.poll();
            // System.out.println(finDemo.val);
            finDemo = finDemo.next;
            if(finDemo.next != null){
                pq.add(finDemo.next);
                // finDemo = finDemo.next;
            }
            // finDemo = finDemo.next;
            // System.out.println(finDemo.val);
        }
        return Final.next;
    }
}