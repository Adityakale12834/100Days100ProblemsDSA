class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n;j++){
                if(i - j >= 0){
                    dp[i] = Math.max(dp[i],j * dp[i-j]);
                }
            }
        }
        return dp[n];
    }
    
}