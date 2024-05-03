class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        Boolean[][] dp = new Boolean[m+1][n+1];
        return DFS(s,t,0,0,dp);
    }
    public boolean DFS(String s,String t,int i,int j,Boolean[][] dp){
        if(i == s.length()){
            return true;
        }
        if(j == t.length()){
            return false;
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }
        boolean val = false;
        if(s.charAt(i) == t.charAt(j)){
            val = DFS(s,t,i+1,j+1,dp);
        }
        else{
            val = DFS(s,t,i,j+1,dp);
        }
        dp[i][j] = val;
        return val;
    }
}