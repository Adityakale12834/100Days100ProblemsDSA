class Solution {
    public int matrixSum(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        for(int i=0;i<n;i++){
            Arrays.sort(nums[i]);
        }
        int sum = 0;
        for(int j=m-1;j>=0;j--){
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
            for(int i=0;i<n;i++){
                pq.add(nums[i][j]);
            }
            sum += pq.poll();
            pq.clear();
        }
        return sum;
    }
}