class pair{
    int i;
    int j;
    int sum;
    public pair(int i,int j,int sum){
        this.i = i;
        this.j = j;
        this.sum = sum;
    }
}
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        List<List<Integer>> list = new ArrayList<>();
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> a.sum - b.sum);

        for(int i=0;i<n;i++){
            pq.add(new pair(i,0,nums1[i]+nums2[0]));
        }

        while(!pq.isEmpty() && k > 0){
            List<Integer> lt = new ArrayList<>();
            lt.add(nums1[pq.peek().i]);
            lt.add(nums2[pq.peek().j]);
            list.add(new ArrayList<>(lt));

            if(pq.peek().j + 1 < m){
                pq.add(new pair(pq.peek().i,pq.peek().j + 1,nums1[pq.peek().i] + nums2[pq.peek().j + 1]));
            }
            pq.poll();
            k--;
        }
        return list;
    }
}