class Solution {
    public boolean isGood(int[] nums) {
        int max = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            max = Math.max(max , num);
        }

        for(int i=1; i<=max; i++){
            mp.put(i, 1);
        }
        mp.put(max, mp.getOrDefault(max, 0)+1);

        int n = nums.length;

        if(max+1 == n){
            for(int num : nums){
                if(mp.containsKey(num)){
                    mp.put(num, mp.getOrDefault(num, 0)-1);
                }
                if(mp.containsKey(num) && mp.get(num) == 0){
                    mp.remove(num);
                }
            }
        }
        if(mp.size() == 0){
            return true;
        }

        return false;
    }
}