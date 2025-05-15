class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        int n = groups.length;
        for(int i=0; i<n; i++){
            if(i==0 || groups[i] != groups[i-1]){
                res.add(words[i]);
            }
        }
        return res;
    }
}