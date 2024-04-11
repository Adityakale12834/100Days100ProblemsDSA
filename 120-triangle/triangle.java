class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n-1).size();
        if(triangle.size() == 1) return triangle.get(0).get(0);
        int[][] dp = new int[n][m];
        for(int i=0;i<triangle.size();i++){
            Arrays.fill(dp[i],-1);
        }
        return findShortest(triangle,0,0,triangle.size()-1,dp);
    }
    public int findShortest(List<List<Integer>> triangle,int i,int j,int total,int[][] dp){
        if(i > total || j >= triangle.get(i).size()){
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];
        
        int sum = triangle.get(i).get(j);
        int left = findShortest(triangle,i+1,j,total,dp);
        int right = findShortest(triangle,i+1,j+1,total,dp);
        return dp[i][j] = sum + Math.min(left,right);
    }
}