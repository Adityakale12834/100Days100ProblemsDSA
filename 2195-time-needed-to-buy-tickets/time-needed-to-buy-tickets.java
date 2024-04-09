class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        while(tickets[k] != 0){
            for(int i=0;i<n;i++){
                if(tickets[i] != 0){
                    tickets[i] = tickets[i] - 1;
                    count++;
                }
                if(i == k && tickets[i] == 0){
                    return count;
                }
            }
        }
        return tickets[n-1];
    }
}