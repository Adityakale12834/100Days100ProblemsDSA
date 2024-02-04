class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        //Sort The Array So for computation so the elements will be from smallest to the largest
        int n = nums.length;

        Set<List<Integer>> Final = new HashSet<>();
        //Declared the HashSet Because No duplicate list should be present.
        int j = 0;
        int k = n-1;
        for(int i=0;i<n;++i){
            j = i+1;
            k = n-1;
            //The initialization has done here because element it should be reinitialize every time while loop ends
            while(j < k){
                List<Integer> list = new ArrayList<>();
                //list should be restart every time while loop iterates so that previously computed values should not be present
                int threesum = nums[i] +nums[j] + nums[k];
                if(threesum == 0){
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    //first we add element into the list
                    Final.add(new ArrayList(list));
                    //now this list is added to the hashset
                    j++;
                    //we increase the pointer for next iteration
                }
                else if(threesum < 0){
                    j++;
                    //evrytime threesum will be less than 0 then j will be incremented
                }
                else{
                    k--;
                    //else k will be decrement.
                }
            }
        }
        List<List<Integer>> listFromHashSet = new ArrayList<>(Final);
        //here we have converted Hashset into List of List.
        return listFromHashSet;
        //returned List of List.
    }  
}