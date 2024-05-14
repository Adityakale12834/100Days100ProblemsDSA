class Solution {
    public int maxProfit(int[] prices) {
        // int n = prices.length;
        // int max = 0;
        // for(int i=0;i<n;i++){
        //     max = Math.max(max,findLargest(prices,0,i) + findLargest(prices,i,n-1));
        // }
        // return max;
        int buy1 = Integer.MIN_VALUE, sell1 = 0;
        int buy2 = Integer.MIN_VALUE, sell2 = 0;
        
        for (int price : prices) {
            buy1 = Math.max(buy1, -price);
            sell1 = Math.max(sell1, buy1 + price);
            buy2 = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price);
        }
        
        return sell2;
    }
    // public int findLargest(int[] prices,int i,int j){
    //     int min = Integer.MAX_VALUE;
    //     int diff = 0;
    //     int op = 0;
    //     for(int i1=i;i<=j;i++){
    //         min = Math.min(min,prices[i1]);
    //         diff = prices[i1] - min;
    //         op = Math.max(op,diff);
    //     }
    //     return op;
}