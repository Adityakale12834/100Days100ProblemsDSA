class Solution {
    public String longestPalindrome(String s) {
        String s1 = s.replaceAll("","#");
        int n = s1.length();
        String max = "";
        for(int i=0;i<n;i++){
            int k=0;
            while(i-k >= 0 && i+k < n && s1.charAt(i-k) == s1.charAt(i+k)){
                if(s1.charAt(i-k) == s1.charAt(i+k) && s1.charAt(i-k) != '#'){
                    String demo = s1.substring(i-k,i+k+1);
                    if(demo.length() > max.length()){
                        max = demo;
                    }
                }
                k++;
            }
        }
        return max.replaceAll("#","");
    }
}