class Solution {
    public int maxDepth(String s) {
        int n =s.length();
        Stack<Character> str = new Stack<>();
        int count =0;
        int maxCounter =0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                str.push('(');
                count++;
            }
            else if(s.charAt(i) == ')'){
                str.pop();
                count--;
            }
            maxCounter = Math.max(maxCounter,count);
        }
        return maxCounter;
    }
}