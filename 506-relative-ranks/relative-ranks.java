class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] arr = new Integer[n];
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = score[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int k = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j] == score[i]){
                    if(j == 0){
                        ans[i] = "Gold Medal";
                    }
                    else if(j == 1){
                        ans[i] = "Silver Medal";
                    }
                    else if(j == 2){
                        ans[i] = "Bronze Medal";
                    }else{
                    ans[i] = Integer.toString(j+1);
                    break;
                    }
                }
            }
        }
        return ans;
    }
}