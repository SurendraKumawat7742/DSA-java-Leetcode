class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int[] freq = new int[3];
        int total = 0;

        while(right < n){
            char c = s.charAt(right);
            freq[c-'a']++;

            while(hasAll(freq)){
                total += n - right;

                char leftC = s.charAt(left);
                freq[leftC-'a']--;
                left++;
            }
            right++;
        }
        return total;
    }
    public boolean hasAll(int[] freq){
        return freq[0]>0 && freq[1]>0 && freq[2]>0;
    }
}