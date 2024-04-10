class Solution {
    public int nthUglyNumber(int n) {
        int[] val = new int[n];
        val[0] = 1;
        int l1 = 0;
        int l2 = 0;
        int l3 = 0;
        for(int i=1;i<n;i++){
            int val1 = Math.min(val[l1]*2,Math.min(val[l2]*3,val[l3]*5));
            val[i] = val1;
            if(val1 == val[l1]*2){
                l1++;
            }
            if(val1 == val[l2]*3){
                l2++;
            }
            if(val1 == val[l3]*5){
                l3++;
            }
        }
        return val[n-1];
    }
}