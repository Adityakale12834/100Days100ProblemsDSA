class pair{
    int val;
    int i;
    public pair(int val,int i){
        this.val = val;
        this.i = i;
    }
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> b.val - a.val);
        int index = 0;
        for(int i=0;i<n;i++){
            pq.offer(new pair(nums[i],i));
            while(pq.peek().i <= i - k ){
                pq.poll();
            }
            if (i >= k - 1) {
                ans[i-k+1] = pq.peek().val;
            }

        }
        return ans;
    }
}