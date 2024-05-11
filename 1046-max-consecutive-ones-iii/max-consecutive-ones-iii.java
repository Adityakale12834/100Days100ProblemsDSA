class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        int i=0;
        int j=0;
        if(nums.length <= k){
            return n;
        }
        while(j < n){
            if(k > 0){
                if(nums[j] == 1){
                    j++;
                }
                else if(nums[j] == 0){
                    j++;
                    k--;
                }
            }
            else if(k <= 0){
                if(nums[j] == 1){
                    j++;
                }
                else{
                    // max = Math.max(max,j-i);
                    while(k <= 0){
                        if(nums[i] == 1){
                            i++;
                        }else{
                            i++;
                            k++;
                        }
                    }
                }  
            }
        max = Math.max(max,j-i);
        }
        return max;
    }
}