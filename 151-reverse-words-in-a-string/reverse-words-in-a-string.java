class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String[] arr = s.trim().split("\\s+");
        int j =0;
        String Final = "";
        
        for(int i=arr.length-1;i>0;i--){
            Final += arr[i] +" ";
        }
        Final += arr[0];
        // System.out.println(list);
        return Final;
    }
}