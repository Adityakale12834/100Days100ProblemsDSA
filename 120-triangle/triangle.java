class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];

        dp[0][0] = triangle.get(0).get(0);

        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j == 0){
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j];
                }
                else if(i == j){
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i-1][j-1],dp[i-1][j]); 
                }
            }
        }
        int max = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max = Math.min(max,dp[n-1][i]);
        }
        return max;
    }
}