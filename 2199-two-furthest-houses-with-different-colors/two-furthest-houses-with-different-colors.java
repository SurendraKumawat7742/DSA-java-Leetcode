class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxLen = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(colors[i] != colors[j]){
                    maxLen = Math.max(maxLen, Math.abs(j-i));
                }
            }
        }
        return maxLen;
    }
}