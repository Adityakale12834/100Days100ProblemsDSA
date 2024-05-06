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
        List<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int n = list.size();
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>= 0;i--){
            while(!st.empty() && st.peek() <= list.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i] = -1;
            }
            else {
                arr[i] = st.peek();
            }
            st.push(list.get(i));
        }
        ListNode head1 = new ListNode(-1);
        ListNode headTemp = head1;
        for(int i=0;i<n;i++){
            if(arr[i] == -1){
                ListNode newNode = new ListNode(list.get(i));
                head1.next = newNode;
                head1 = head1.next;
            }
        }
        return headTemp.next;
    }
}