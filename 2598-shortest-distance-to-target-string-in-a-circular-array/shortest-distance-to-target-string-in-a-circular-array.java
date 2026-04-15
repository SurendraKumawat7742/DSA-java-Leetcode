class Solution {
    public int closestTarget(String[] words, String tar, int stIdx) {
        int n = words.length;
        int res = n;
        for(int i=0; i<n; i++){
            if(words[i].equals(tar)){
                int dist = Math.abs(i-stIdx);
                res = Math.min(res, Math.min(dist, n-dist));
            }
        }
        
        return res < n ? res : -1;
    }
}