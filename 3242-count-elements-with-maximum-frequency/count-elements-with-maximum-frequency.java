class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(int freq : map.values()){
            max = Math.max(max,freq);
        }
        int count = 0;
        for(int freq : map.values()){
            if(freq == max){
                count += max;
            }
        }
        return count;
    }
}