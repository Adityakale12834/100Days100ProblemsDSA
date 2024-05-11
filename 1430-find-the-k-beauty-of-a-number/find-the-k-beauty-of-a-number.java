class Solution {
    public int divisorSubstrings(int num, int k) {
        int i=0;
        int j=0;
        String number = Integer.toString(num);
        String val = "";
        int n = number.length();
        int count = 0;
        while(j <= n){
            if(j < k){
                j++;
            }
            else if(Integer.parseInt(number.substring(i,j)) != 0 && num % Integer.parseInt(number.substring(i,j)) == 0){
                count += 1;
                i++;
                j++;
            }else{
                i++;
                j++;
            }
        }
        return count;
    }
}