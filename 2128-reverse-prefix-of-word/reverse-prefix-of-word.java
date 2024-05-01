class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        String rev = "";
        for(int i=0;i<n;i++){
            if(word.charAt(i) == ch){
                String part = word.substring(0,i+1);
                String part2 = word.substring(i+1,n);
                rev = reverse(part) + part2;
                return rev;
            }
        }
        return word;
    }
    public String reverse(String part){
        int n = part.length();
        String subpart = "";
        for(int i=n-1;i>=0;i--){
            subpart += part.charAt(i);
        }
        return subpart;
    }
}