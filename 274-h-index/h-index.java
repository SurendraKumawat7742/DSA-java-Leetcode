class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] cnt = new int[n+1];
        for(int citation : citations){
            cnt[Math.min(citation, n)]++;
        }

        int papers = 0;
        for(int hIndex=n; hIndex>=0; hIndex--){
            papers += cnt[hIndex];
            if(papers >= hIndex){
                return hIndex;
            }
        }
        return 0;
    }
}