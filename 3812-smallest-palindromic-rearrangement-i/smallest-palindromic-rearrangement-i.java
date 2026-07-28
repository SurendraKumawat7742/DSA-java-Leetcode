class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder left = new StringBuilder();
        char mid = ' ';
        for(int i=0; i<26; i++){
            char c = (char)(i + 'a');
            if(freq[i]%2 != 0){
                mid = c;
            }
            for(int j=0; j<freq[i]/2; j++){
                left.append(c);
            }
        }
        StringBuilder res = new StringBuilder(left);
        if(n%2 != 0){
            res.append(mid);
        }
        res.append(new StringBuilder(left).reverse());
        return res.toString();
    }
}