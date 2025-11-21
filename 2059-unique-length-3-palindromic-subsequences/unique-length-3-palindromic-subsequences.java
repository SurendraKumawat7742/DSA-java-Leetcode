class Solution {
    public int countPalindromicSubsequence(String s) {
    //Time Limit Exceed
    //     Set<String> set = new HashSet<>();
    //     int n = s.length();
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0; i<n-2; i++){
    //         sb.append(s.charAt(i));
    //         for(int j=i+1; j<n-1; j++){
    //             sb.append(s.charAt(j));
    //             for(int k=j+1; k<n; k++){
    //                 sb.append(s.charAt(k));
    //                 set.add(sb.toString());
    //                 sb.deleteCharAt(2);
    //             }
    //             sb.deleteCharAt(1);
    //         }
    //         sb.deleteCharAt(0);
    //     }

    //     int res =0 ;
    //     for(String ele : set){
    //         if(checkPalin(ele)){
    //             res++;
    //         }
    //     }
    //     return res;
    // }
    // public boolean checkPalin(String s){
    //     int n = s.length();
    //     int i=0;
    //     int j=n-1;
    //     while(i <= j){
    //         if(s.charAt(i) != s.charAt(j)){
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;


    //Optimized
        int n = s.length();
        int res = 0;
        
        for(char c='a'; c<='z'; c++){
            int left = s.indexOf(c);
            int right = s.lastIndexOf(c);

            if(left == -1 || right == -1 || left >= right){
                continue;
            }

            boolean[] freq = new boolean[26];
            for(int i=left+1; i<right; i++){
                freq[s.charAt(i)-'a'] = true;
            }

            for(boolean b : freq) if(b) res++;

        }
        return res;
    }
}