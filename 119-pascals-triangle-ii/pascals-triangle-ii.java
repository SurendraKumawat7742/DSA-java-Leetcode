class Solution {
    public List<Integer> getRow(int rowIndex) {

//1st
        // List<List<Integer>> ans = new ArrayList<>();
        // for(int i=0; i<=rowIndex; i++){
        //     List<Integer> row = new ArrayList<>();
        //     for(int j=0; j<=i; j++){
        //         if(j == 0 || i == j){
        //             row.add(1);
        //         }else{
        //             int val = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
        //             row.add(val);
        //         }
        //     }
        //     ans.add(row);
        // }
        // List<Integer> res = new ArrayList<>();
        // for(int i=0; i<rowIndex+1; i++){
        //     res.add(ans.get(rowIndex).get(i));
        // }
        // return res;


//2nd
        int ans[] = new int[rowIndex+1];
        Arrays.fill(ans,1);
        
        for(int i=2; i<=rowIndex; i++)
        {
            for(int j=1; j<i; j++)
            {
                 ans[i-j] +=ans[i-j-1];
            }
        }
        
         return  convertUsingAdd(ans);
    }
    public List<Integer> convertUsingAdd(int[] ans){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<ans.length; i++){
            list.add(ans[i]);
        }
        return list;
    }
}