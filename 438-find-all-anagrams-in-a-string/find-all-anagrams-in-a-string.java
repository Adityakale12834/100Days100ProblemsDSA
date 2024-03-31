class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int size1 = p.length();
        p = sorting(p);
        for(int i=0;i<s.length()-size1+1;i++){
            int j = i + size1;
            String sb = s.substring(i,j);
            sb = sorting(sb);
            if(sb.equals(p)){
                list.add(i);
            }
        }
        return list;
    }
    public String sorting(String s){
        char []arr = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}