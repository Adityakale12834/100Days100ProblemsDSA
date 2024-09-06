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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        ListNode Final = new ListNode(-1);
        Final.next = head;
        ListNode slow = Final;
        ListNode fast = Final.next;
        while(slow != null && fast != null){
            if(set.contains(fast.val)){
                slow.next = fast.next;
                ListNode dummy = fast;
                fast = fast.next;
                dummy.next = null;
            }
            else{
                slow = slow.next;
                fast = fast.next;
            }
        }
        return Final.next;
    }
}