class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int val = n - (k % n);

        int[] ans = new int[n];
        int j=0;
        for(int i=val;i<n;i++){
            ans[j++] = nums[i];
        }
        for(int i=0;i<val;i++){
            ans[j++] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = ans[i];
        }
    }
}