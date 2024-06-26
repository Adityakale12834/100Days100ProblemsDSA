class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int max = 0;
        for(int i =0;i<n;i++){
            dp[i] = 1;
            for(int j = i;j >= 0;j--){
                if(nums[i] > nums[j] ){
                   dp[i] = Math.max(dp[i], 1+dp[j]);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}