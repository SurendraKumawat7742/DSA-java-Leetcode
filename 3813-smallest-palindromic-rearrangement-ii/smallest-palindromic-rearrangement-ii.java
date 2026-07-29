class Solution {
    public String smallestPalindrome(String s, long k) {
        int n = s.length();
        int div = n/2;
        int[] freq = new int[26];
        for(int i=0; i<div; i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder left = new StringBuilder();
        long stIdx = 1;
        for(int pos=0; pos<div; pos++){
            for(int i=0; i<26; i++){
                if(freq[i] == 0) continue;

                freq[i]--;
                long ways = perm(div-pos-1, freq, k);
                if(stIdx+ways > k){
                    left.append((char)(i+'a'));
                    break;
                }
                freq[i]++;
                stIdx += ways;
            }
        }
        if(left.length() < div){
            return "";
        }
        if(n%2 != 0){
            left.append(s.charAt(div));
        }
        for(int i=div-1; i>=0; i--){
            left.append(left.charAt(i));
        }
        return left.toString();
    }
    public long perm(int rem, int[] freq, long k){
        long ways = 1;
        for(int i=0; i<26; i++){
            if(freq[i] == 0) continue;

            ways *= comb(rem, freq[i], k);
            if(ways > k){
                break;
            }

            rem -= freq[i];
        }
        return ways;
    }
    public long comb(long n, long m, long k){
        long res = 1;
        m = Math.min(m, n-m);
        for(long i=1; i<=m; i++){
            res = (res*(n-i+1))/i;
            if(res > k){
                return k+1;
            }
        }
        return res;
    }
}