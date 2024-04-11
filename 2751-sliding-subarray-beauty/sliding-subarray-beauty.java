
class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int[] b = new int[101]; // Using 101 instead of 50 to handle negative indices
        int i = 0;
        int j = 0;
        while (j < n) {
            if (j - i + 1 < k) {
                if (nums[j] < 0)
                    b[nums[j] + 50]++; // Shift negative indices by 50 to make them positive
                j++;
            } else if (j - i + 1 == k) {
                if (nums[j] < 0)
                    b[nums[j] + 50]++; // Shift negative indices by 50 to make them positive
                if (j - k >= 0 && nums[j - k] < 0)
                    b[nums[j - k] + 50]--; // Decrement the count when the element goes out of the window
                int c = 0;
                for (int idx = 0; idx < 101; idx++) { // Iterate through all possible indices
                    c += b[idx];
                    if (c >= x) {
                        result[i] = idx - 50; // Shift the index back to negative range
                        break;
                    }
                }
                i++;
                j++;
            }
        }
        return result;
    }
}