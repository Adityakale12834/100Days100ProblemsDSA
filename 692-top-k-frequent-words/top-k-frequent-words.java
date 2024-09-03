class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n = words.length;
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->{
                if(a.getValue() != b.getValue())
                    return a.getValue().compareTo(b.getValue());
                return -a.getKey().compareTo(b.getKey());
            });
        HashMap<String,Integer> map = new HashMap<>();
        List<String> lt = new ArrayList<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        for(Map.Entry<String,Integer> hMap : map.entrySet()){
            pq.add(hMap);
            if(pq.size() > k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            lt.add(pq.poll().getKey());
        }
        Collections.reverse(lt);
        return lt;
    }
}