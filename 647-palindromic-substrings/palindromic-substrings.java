class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        if(n <= 1){
            return n;
        }
        int cnt = n;
        for(int i=0; i<n; i++){
            int l = i, r = i+1;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                cnt++;
                l--;
                r++;
            }

            l = i-1;
            r = i+1;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                cnt++;
                l--;
                r++;
            }
        }
        return cnt;
    }
}