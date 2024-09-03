class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        int n = nums.length;
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (a.length() == b.length()) {
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) > b.charAt(i)) {
                        return 1;
                    } else if (a.charAt(i) < b.charAt(i)) {
                        return -1;
                    }
                }
                return 0; // If all characters are equal, the strings are equal
            } else {
                return a.length() - b.length(); // Compare by length if they are different
            }
        });

        for(String word : nums){
            pq.add(word);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.poll();
    }
}