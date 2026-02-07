class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();

//1st
        // //count b left side
        // int cntB = 0;
        // int[] pre = new int[n];
        // for(int i=0; i<n; i++){
        //     char c = s.charAt(i);
        //     pre[i] = cntB;
        //     if(c == 'b'){
        //         cntB++;
        //     }
        // }
        // //count a left side
        // int cntA = 0;
        // int[] suff = new int[n];
        // for(int i=n-1; i>=0; i--){
        //     char c = s.charAt(i);
        //     suff[i] = cntA;
        //     if(c == 'a'){
        //         cntA++;
        //     }
        // }
        // int min = n;
        // for(int i=0; i<n; i++){
        //     min = Math.min(min, pre[i]+suff[i]);
        // }
        // return min;


// 2nd using Stack
        Stack<Character> st = new Stack<>();
        int minCnt = 0;
        for(int i=0; i<n; i++){
            if(!st.isEmpty() && st.peek()=='b' && s.charAt(i)=='a'){
                st.pop();
                minCnt++;
            }else{
                st.push(s.charAt(i));
            }
        }
        return minCnt;
    }
}