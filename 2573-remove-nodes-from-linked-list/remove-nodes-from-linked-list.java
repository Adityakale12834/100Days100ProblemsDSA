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
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> st = new Stack<>();
        while(temp != null){
            while(!st.empty() && st.peek().val < temp.val){
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }
        ListNode cur = null;
        while(!st.isEmpty()){
            temp = st.pop();
            temp.next = cur;
            cur = temp;
        }
        return cur;
    }
}