class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        HashSet<List<Integer>> Final = new HashSet<>();
        Arrays.sort(nums);
        int k = 2;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j< (n - 2);j++){
                k = j+1;
                int l = n-1;
                while(k < l){
                    List<Integer> list = new ArrayList<>();
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        Final.add(new ArrayList<>(list));
                        l--;
                    }
                    else if(sum < target){
                       k++; 
                    }else{
                        l--;
                    }
                }
            }
        }
        List<List<Integer>> finalList = new ArrayList<>(Final);
        return finalList;
    }
}