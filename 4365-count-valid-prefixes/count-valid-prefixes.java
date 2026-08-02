class Solution {
    public int countValidPrefixes(String s) {
        int n = s.length();
        int cntO = 0;
        int cntZ = 0;
        int cnt = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                cntZ++;
            }else{
                cntO++;
            }
            if(Math.abs(cntZ-cntO) <= 1){
                cnt++;
            }
        }
        return cnt;
    }
}