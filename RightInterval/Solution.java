class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] arr = new int[n][3];
        /**create a new Array to store start, end, index of interval because we will be sorting the array so the index 
        should not be lost as we have to return indexes**/
        for(int i = 0; i < n ; i++ ){
            arr[i][0] = intervals[i][0];
            arr[i][1] = intervals[i][1];
            arr[i][2] = i;
            /**everything will be same in the arr array just add index at the array*/
        }
        Arrays.sort(arr, (a,b) -> {
            return a[0] - b[0];
            /* Sort the Array according the first element */
        });
        int[] res = new int[n];
        /* create the new Array to store a final result */
        for(int i=0;i<n; i++){
            int idx = arr[i][2];
            //store the indexes in the idx of that arr it is the jth element
            int val = binarySearch(arr,arr[i][1]);
            //now search in arr using the binary search
            res[idx] = (val == -1) ? -1 : arr[val][2];
            //we store in res the jth value 
            //if it is -1 then store -1 
            //else stored the ith index in res[idx]
        }
        return res;
    }
    public int binarySearch(int[][] intervals, int ele){
        int si = 0;
        int li = intervals.length-1;
        int ans = -1;

        while(si <= li){
            int mid = (si + li)/2;

            if(intervals[mid][0] >= ele){
                ans = mid;
                li = mid - 1;
            }
            else{
                si = mid + 1;
            }
        }
        return ans;
    }
}