class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[n][n][k+1];
        return DFS(k,row,column,n,dp);
    }
    public double DFS(int k,int row,int column,int n,double[][][] dp){
        if(k < 0){
            return 1.0;
        }
        if(k < 0 || row < 0 || row >= n || column < 0 || column >= n){
            return 0.0;
        }
        if(dp[row][column][k] != 0) return dp[row][column][k];
        double a = 1.0 / 8 * DFS(k-1,row-2,column+1,n,dp);
        double b =1.0 / 8 * DFS(k-1,row-1,column+2,n,dp);
        double c =1.0 / 8 * DFS(k-1,row+1,column+2,n,dp);
        double d =1.0 / 8 * DFS(k-1,row+2,column+1,n,dp);
        double e =1.0 / 8 * DFS(k-1,row+2,column-1,n,dp);
        double f =1.0 / 8 * DFS(k-1,row+1,column-2,n,dp);
        double g =1.0 / 8 * DFS(k-1,row-1,column-2,n,dp);
        double h =1.0 / 8 * DFS(k-1,row-2,column-1,n,dp);
        double sum = a+b+c+d+e+f+g+h;
        dp[row][column][k] = sum;
        return sum;
    }
}
// public class Solution {

//     public double knightProbability(int n, int k, int row, int column) {
//         return DFS(k, row, column, n);
//     }

//     public double DFS(int k, int row, int column, int n) {
//         if (k < 0) {
//             return 1.0;
//         }
//         if (row < 0 || row >= n || column < 0 || column >= n) {
//             return 0.0;
//         }

//         double total_prob = 0.0;
//         int[][] directions = {
//                 {-2, 1},
//                 {-1, 2},
//                 {1, 2},
//                 {2, 1},
//                 {2, -1},
//                 {1, -2},
//                 {-1, -2},
//                 {-1, -2}
//         };
//         for (int i = 0; i < 8; i++) {
//             int row1 = row + directions[i][0];
//             int col1 = column + directions[i][1];
//             double prob1 = 1.0 / 8 * DFS(k - 1, row1, col1, n);
//             total_prob += prob1;
//         }
//         return total_prob;
//     }
// }