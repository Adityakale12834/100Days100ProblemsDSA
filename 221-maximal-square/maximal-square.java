class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        int max =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == '0'){
                    continue;
                }
                else if(i == 0 || j == 0) dp[i][j] = matrix[i][j] - 48;
                else{
                    dp[i][j] = (matrix[i][j] - 48) + Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                }
            max = Math.max(max,dp[i][j]);
            }
        }
        return max * max;
    }
}