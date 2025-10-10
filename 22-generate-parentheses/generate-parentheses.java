class Solution {
    public void helper(List<String> ans,int openCnt,int closeCnt,String s,int n) {
        if(openCnt == n && closeCnt == n){
            ans.add(s);
        }else{
            //subproblems
            if(openCnt > closeCnt){
                helper(ans, openCnt, closeCnt+1, s+")", n);
            }
            if(openCnt < n){
                helper(ans, openCnt+1, closeCnt, s+"(", n);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int openCnt = 0;
        int closeCnt = 0;
        String s = "";
        helper(ans, openCnt, closeCnt, s, n);
        return ans;
    }
}