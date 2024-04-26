class Solution {
    public int[] twoSum(int[] num, int target) {
        int n = num.length;
        int[] arr = {-1,-1};
        int low = 0;
        int high = n-1;
        if(num[low]+num[high] == target){
            arr[0] = low+1;
            arr[1] = high+1;
            return arr;
        }
        while(low < high){
            int val = num[low]+num[high];
            if(val == target){
                arr[0] = low+1;
                arr[1] = high+1;
                return arr;
            }
            else if(val > target){
                high = high-1;
            }
            else{
                low = low+1;
            }
        }
        return  arr;
    }
}