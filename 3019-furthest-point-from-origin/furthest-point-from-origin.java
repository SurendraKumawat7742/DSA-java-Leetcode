class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        // int n = moves.length;
        int cntL = 0;
        int cntR = 0;
        int cntS = 0;
        for(char c : moves.toCharArray()){
            if(c == 'L'){
                cntL++;
            }else if(c == 'R'){
                cntR++;
            }else{
                cntS++;
            }
        }

        int max = 0;
        int min = 0;
        if(cntL > cntR){
            max = cntL;
            min = cntR;
        }else{
            max = cntR;
            min = cntL;
        }

        int res = max + cntS - min;

        return res;
    }
}