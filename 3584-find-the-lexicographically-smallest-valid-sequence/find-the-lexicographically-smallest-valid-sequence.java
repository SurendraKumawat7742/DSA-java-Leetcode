class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[] suff = new int[n];
        int r = m-1;
        int c = 0;
        for(int i=n-1; i>=0; i--){
            suff[i] = c;
            if(r>=0 && word1.charAt(i) == word2.charAt(r)){
                r--;
                c++;
            }
        }

        int[] ans = new int[m];
        boolean canChange = false;
        int j = 0;
        for(int i=0; i<n && j<m; i++){
            if(word1.charAt(i) == word2.charAt(j)){
                ans[j++] = i;
            }else if(!canChange && suff[i] >= m-j-1){
                ans[j++] = i;
                canChange = true;
            }
        }
        if(j == m){
            return ans;
        }
        return new int[]{};
    }
}