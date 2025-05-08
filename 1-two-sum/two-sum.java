class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int ans[] = new int[2];
       for(int i=0;i<nums.length;i++){
        int curr = nums[i];
        int remsum = target-curr;
        if(map.containsKey(remsum)){
            ans[0] = map.get(remsum);
            ans[1] = i;
            return ans;
        }
        map.put(curr,i);
       }
       return ans;
    }
}