class Solution {
    public int countSubstrings(String s) {
        String s1 = s.replaceAll("","#");
        int n = s1.length();
        int count = 0;
        for(int i=0;i < n;i++){
            int k = 0;
            while(i-k >= 0 && i+k < n && s1.charAt(i-k) == s1.charAt(i+k)){
                if(s1.charAt(i-k) == s1.charAt(i+k) && s1.charAt(i-k) != '#'){
                    count++;
                }
                k++;
            }
        }
        return count;
    }
}