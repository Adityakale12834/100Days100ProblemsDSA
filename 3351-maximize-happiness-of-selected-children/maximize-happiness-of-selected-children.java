class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        Arrays.sort(happiness);
        long maxHappy = 0;
        int decreaseVal = 0;
        for(int i=n-1;i>=0 && k > 0;i--){
            if(happiness[i] - decreaseVal <= 0){
               return maxHappy; 
            }
            maxHappy += happiness[i] - decreaseVal;
            decreaseVal = decreaseVal + 1;
            k--;
        }
        return maxHappy;
    }
}