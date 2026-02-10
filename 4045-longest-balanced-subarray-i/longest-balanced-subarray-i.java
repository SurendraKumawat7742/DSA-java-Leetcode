class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        for(int i=0; i<n; i++){
            Map<Integer, Integer> odd = new HashMap<>();
            Map<Integer, Integer> even = new HashMap<>();
            for(int j=i; j<n; j++){
                Map<Integer, Integer> mp = (nums[j] & 1) == 1?odd:even;
                mp.put(nums[j], mp.getOrDefault(nums[j],0)+1);
                if(odd.size() == even.size()){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
}