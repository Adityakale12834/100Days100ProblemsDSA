class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        return DFS(s,t,0,0);
    }
    public boolean DFS(String s,String t,int i,int j){
        if(i == s.length()){
            return true;
        }
        if(j == t.length()){
            return false;
        }
        boolean val = false;
        if(s.charAt(i) == t.charAt(j)){
            val = DFS(s,t,i+1,j+1);
        }
        else{
            val = DFS(s,t,i,j+1);
        }
        return val;
    }
}