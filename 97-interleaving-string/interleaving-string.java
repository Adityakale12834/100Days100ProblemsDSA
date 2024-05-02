class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        Boolean[][] dp = new Boolean[s1.length()+1][s2.length()+1];
        return DFS(s1,0,s2,0,s3,dp);
    }
    public boolean DFS(String s1,int i,String s2,int j,String s3,Boolean[][] dp){
        if( i == s1.length() && j == s2.length()){
            return true;
        }
        if(dp[i][j] != null) return dp[i][j];
        boolean val = false;
        if( i < s1.length() && s1.charAt(i) == s3.charAt(i+j)){
            val |= DFS(s1,i+1,s2,j,s3,dp);
        }
        if(!val && j < s2.length() && s2.charAt(j) == s3.charAt(i+j)){
                val |= DFS(s1,i,s2,j+1,s3,dp);
        }
        dp[i][j] = val;
    return val;
    }
}