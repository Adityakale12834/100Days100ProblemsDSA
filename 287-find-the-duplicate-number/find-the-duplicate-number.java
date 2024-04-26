class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n =  nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            if(nums[low] == nums[low+1]){
                return nums[low];
            }else{
                low = low + 1;
            }
            if(nums[high] == nums[high-1]){
                return nums[high];
            }else{
                high = high - 1;
            }
        }
        return -1;
    }
}