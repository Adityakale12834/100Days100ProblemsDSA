class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        if(n == 1){
            return 0;
        }
        while(low <= high){
            if(low == 0){
                if(nums[low] > nums[low+1]){
                    return low;
                }else{
                    low = low + 1;
                }
            }else{
                if(nums[low] > nums[low+1] && nums[low] > nums[low-1]){
                    return low;
                }else{
                    low = low + 1;
                }
            }
            if(high == n-1){
                if(nums[high] > nums[high-1]){
                    return high;
                }else{
                    high = high - 1;
                }
            }else{
                if(nums[high] > nums[high+1] && nums[high] > nums[high-1]){
                    return high;
                }else{
                    high = high + 1;
                }
            }
        }
        return 0;
    }
}