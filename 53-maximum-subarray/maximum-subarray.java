class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int maxbyfar = Integer.MIN_VALUE;
        int maxending = 0;

        for(int i=0;i<size;i++){
            maxending += nums[i];
            if(maxbyfar < maxending){
                maxbyfar = maxending;
            }
            if(maxending < 0){
                maxending =0;
            }
        }
        return maxbyfar;
    }
}