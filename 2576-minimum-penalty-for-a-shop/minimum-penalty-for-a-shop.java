class Solution {
    public int bestClosingTime(String s) {
//1st
        // int n = s.length();
        // int currPen = 0;
        // for(int i=0; i<n; i++){
        //     if(s.charAt(i) == 'Y'){
        //         currPen++;
        //     }
        // }
        // int minP = currPen;
        // int earlHour = 0;
        // for(int i=0; i<n; i++){
        //     char ch = s.charAt(i);
        //     if(ch == 'Y'){
        //         currPen--;
        //     }else{
        //         currPen++;
        //     }
        //     if(currPen < minP){
        //         earlHour = i+1;
        //         minP = currPen;
        //     }
        // }
        // return earlHour;


//2nd
        int maxScore = 0, score = 0, rightTime = -1;
        for (int i = 0; i < s.length(); i++) {
            score += (s.charAt(i) == 'Y') ? 1 : -1;
            if (score > maxScore) {
                maxScore = score;
                rightTime = i;
            }
        }
        return rightTime+1;
    }
}