class pair{
    int valu;
    int i;
    public pair(int valu,int i){
        this.valu = valu;
        this.i = i;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        List<Integer> Final = new ArrayList<>();
        int[] dummy = new int[n];
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.valu == b.valu){
                if(a.i < b.i){
                    return 1;
                }   
            }
            else if(a.valu < b.valu){
                return 1;
            }
            return -1;
        });
        for(int i=0;i<n;i++) {
            // dummy[i] = Math.abs(arr[i] - x);
            pq.add(new pair(Math.abs(arr[i] - x),arr[i]));
            if(pq.size() > k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            Final.add(pq.poll().i);
        }
        Collections.sort(Final);
        return Final;
    }
}