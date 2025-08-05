class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = baskets.length;
        int cnt = 0;
        for(int fruit : fruits){
            int unset = 1;
            for(int i=0; i<n; i++){
                if(fruit <= baskets[i]){
                    unset = 0;
                    baskets[i] = 0;
                    break;
                }
            }
            cnt += unset;
        }
        return cnt;
    }
}