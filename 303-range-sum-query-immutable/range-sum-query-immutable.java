class NumArray {
    List<Integer> ls = new ArrayList<>();
    public NumArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            this.ls.add(nums[i]);
        }
    }
    
    public int sumRange(int left, int right) {
        int sum = 0;
        while(left <= right){
            sum += ls.get(left);
            left++;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */