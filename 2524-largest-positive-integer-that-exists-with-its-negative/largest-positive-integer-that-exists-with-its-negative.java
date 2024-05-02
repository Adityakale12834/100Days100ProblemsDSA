class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int max = -1 ;
        for(int i=0;i<n;i++){
            if(nums[i] < 0){
                set.add(nums[i]);
            }
            else{
                if(set.contains(-(nums[i]))){
                    max = Math.max(max,nums[i]);
                }
            }
        }
        return max;
    }
}