class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        int[][] nums = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j= 0;j<m;j++){
                nums[i][j] = matrix[i][j] - 48 ;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i == 0){
                     dp[i][j] = nums[i][j];
                }
                else if(nums[i][j] == 0){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = 1 + dp[i-1][j];
                }
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,largestHistogram(dp[i]));
        }
        return max;
    }
    public int largestHistogram(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        
        int[] nsl = new int[n];
        int[] nsr = new int[n];

        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsr[i]= arr.length;
            }else{
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }
        

        stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                
                nsl[i]= -1;
            }else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }

        
        int max = 0;
        for(int i=0;i<n;i++){
            int ans = arr[i] * (nsr[i] - nsl[i] -1);
            max = Math.max(max,ans);
        }
        return max;
    }
}