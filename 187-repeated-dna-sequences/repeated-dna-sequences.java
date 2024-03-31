class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        List<String> list = new ArrayList<>();
        int n = s.length();
        for(int i=0;i<n-9;i++){
            int j=i+10;
            if(set.contains(s.substring(i,j))){
               set2.add(s.substring(i,j));
               continue;
            }
            set.add(s.substring(i,j));
        }
        list.addAll(set2);
        return list;
    }
}