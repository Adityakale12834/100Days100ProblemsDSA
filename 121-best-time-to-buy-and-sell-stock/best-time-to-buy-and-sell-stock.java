class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int diff = 0;
        int op = 0;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            diff = prices[i] - min;
            op = Math.max(op,diff);
        }
        return op;
    }
}