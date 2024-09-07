class pair{
    int i;
    int val;
    public pair(int i,int val){
        this.i = i;
        this.val = val;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) ->{
            if(a.val == b.val){
                return a.i - b.i;
            }
            else{
                return a.val - b.val;
            }
        });
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1){
                    count += 1;
                }
            }
            pq.add(new pair(i,count));
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll().i;
        }
        return ans;
    }
}