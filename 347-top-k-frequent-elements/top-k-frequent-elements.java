class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        heap.addAll(map.entrySet());
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = heap.poll().getKey();
        }
        return ans;
    }
}