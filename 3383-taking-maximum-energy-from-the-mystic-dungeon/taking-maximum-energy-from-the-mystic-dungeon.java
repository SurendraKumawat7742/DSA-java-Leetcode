class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int max = Integer.MIN_VALUE;
        for(int i=n-k; i<n; i++){
            int cnt = 0;
            for(int j=i; j>=0; j-=k){
                cnt += energy[j];
                max = Math.max(max, cnt);
            }
        }
        return max;
    }
}