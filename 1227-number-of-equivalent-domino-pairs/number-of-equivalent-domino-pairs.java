class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
    //Ist approach(Brute Force)
        // int count = 0;
        // int n = dominoes.length;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         int a = dominoes[i][0] , b = dominoes[i][1];
        //         int c = dominoes[j][0] , d = dominoes[j][1];
        //         if((a==c && b==d) || (a==d && b==c)){
        //             count++;
        //         }
        //     }
        // }
        // return count;

    //IInd approach
        int nums[] = new int[100];
        int res = 0;
        for(int[] domino : dominoes){
            int val = domino[0] < domino[1] ? domino[0]*10 + domino[1]
                        : domino[1]*10 + domino[0];
            
            res += nums[val];
            nums[val]++;
        }
        return res;
    }
}