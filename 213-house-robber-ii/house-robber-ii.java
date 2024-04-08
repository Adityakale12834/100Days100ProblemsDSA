class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(nums.length == 1) return nums[0];
        Integer[] dp = new Integer[n];
        int ans = solve(nums,dp,0,n-1);
        Arrays.fill(dp,null);
        ans = Math.max(ans,solve(nums,dp,1,n));
        return ans;
    }
    public int solve(int[] nums,Integer[] dp, int i,int j){
        if(i >= j){
            return 0;
        }
        if(dp[i] != null) return dp[i];
        dp[i] = Math.max(solve(nums,dp,i+1,j),solve(nums,dp,i+2,j) + nums[i]);
        return dp[i];
    }
}