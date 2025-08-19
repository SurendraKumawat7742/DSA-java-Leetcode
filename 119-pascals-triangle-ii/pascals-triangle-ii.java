class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j == 0 || i == j){
                    row.add(1);
                }else{
                    int val = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    row.add(val);
                }
            }
            ans.add(row);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<rowIndex+1; i++){
            res.add(ans.get(rowIndex).get(i));
        }
        return res;
    }
}