class pair{
    int i;
    int j;
    public pair(int i,int j){
        this.i = i;
        this.j = j;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // same object reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // not the same type
        }
        pair other = (pair) obj;
        // Compare the fields
        return this.i == other.i && this.j == other.j;
    }

    // Override hashCode method to generate a hash based on i and j
    @Override
    public int hashCode() {
        return Objects.hash(i, j);
    }

}
class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<pair> set = new HashSet<>();
        int count = 0;
        int low = 0;
        int high = 1;
        while(high < n){
            int diff = nums[high] - nums[low];
            if(diff == k ){
                set.add(new pair(nums[low], nums[high])); 
                low++;
                high++;
            }
            else if(diff > k){
                low++;
            }
            else{
                high++;
            }
            if(low == high){
                high++;
            }
        }
        return set.size();
    }
}