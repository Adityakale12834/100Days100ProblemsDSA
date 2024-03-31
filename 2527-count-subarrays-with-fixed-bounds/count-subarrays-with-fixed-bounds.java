class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int left = -1;
        int right = -1;
        int faulty = -1;

        for(int i=0;i<nums.length;++i){
            if(!(minK <= nums[i] && nums[i] <= maxK)){
                faulty = i;
            }
            if(nums[i] == minK){
                left = i;
            }
            if(nums[i] == maxK){
                right = i;
            }
            res = res + Math.max(0, Math.min(left, right) - faulty);
        }
        return res;
    }
}