class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(int k=0;k<n;k++){
                    max = Math.max(max,matrix[k][j]);
                }
                for(int k=0;k<m;k++){
                    min = Math.min(min,matrix[i][k]);
                }
                if(max <= matrix[i][j] && min >= matrix[i][j]){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}