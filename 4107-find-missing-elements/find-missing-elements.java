class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=min+1; i<max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}