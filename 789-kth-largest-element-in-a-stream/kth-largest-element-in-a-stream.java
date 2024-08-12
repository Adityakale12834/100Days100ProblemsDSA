class KthLargest {
    public int k;
    public int[] nums;
    ArrayList<Integer> list = new ArrayList<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
    }
    
    public int add(int val) {
        list.add(val);
        int n = list.size();
        Collections.sort(list);
        return list.get(n-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */