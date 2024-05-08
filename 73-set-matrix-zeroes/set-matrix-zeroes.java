class Solution {
    public void setZeroes(int[][] matrix) {
       int n = matrix.length;
       int m = matrix[0].length;
       HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    if(map.containsKey(i)){
                        map.get(i).add(j);
                    }
                    else{
                        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(j));
                        map.put(i,l);
                    }
                }
            }
        }
        for(Map.Entry<Integer,List<Integer>> curr : map.entrySet()){
            int col = curr.getKey();
            List<Integer> list = curr.getValue();
            for(int row : list){
                for(int i=0;i<n;i++){
                    matrix[i][row] = 0;
                }
                for(int i=0;i<m;i++){
                matrix[col][i] = 0;
                }
            }
        }
    }
}