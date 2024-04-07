class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                pq.add(matrix[i][j]);
            }
        }
        int count = 0;
        for(int i=0;i<n*m;i++){
            if(count == k-1){
                return pq.poll();
            }
            pq.poll();
            count++;
        }
        return matrix[n-1][m-1];
    }
}