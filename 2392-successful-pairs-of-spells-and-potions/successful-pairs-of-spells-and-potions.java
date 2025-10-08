class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        Arrays.sort(potions);
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            long spell = (long)spells[i];
            int idx = binarySea(potions, spell, success);
            if(idx != -1){
                ans[i] = potions.length - idx;
            }
        }
        return ans;
    }

    public int binarySea(int[] potions, long strength, long success){
        int low = 0, high = potions.length-1, idx = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if((long)potions[mid]*strength >= success){
                idx = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return idx;
    }
}