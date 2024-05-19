class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        if(nums.length == 1){
            return true;
        }
        if(nums.length == 2){
            if(nums[0] % 2 == 0 && nums[1] % 2 != 0 || nums[0] % 2 != 0 && nums[1] % 2 == 0){
                return true;
            }
            return false;
        }
        for(int i=1;i<n-1;i++){
            if(!((nums[i-1] % 2 == 0 && nums[i] % 2 != 0 && nums[i+1] % 2 == 0) || (nums[i-1] % 2 != 0 && nums[i] % 2 == 0 && nums[i+1] % 2 != 0))){
                return false;
            }
        }
        return true;
    }
}