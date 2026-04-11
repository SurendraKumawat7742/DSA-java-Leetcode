class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;

        Map<Integer, List<Integer>> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            mp.putIfAbsent(nums[i], new ArrayList<>());
            mp.get(nums[i]).add(i);
        }
        int min = Integer.MAX_VALUE;
        for(List<Integer> list : mp.values()){
            if(list.size() >= 3){
                for(int i=0; i<list.size()-2; i++){
                    int currDist = list.get(i+2)-list.get(i);
                    min = Math.min(min, 2*currDist);
                }
            }
        }
        return min==Integer.MAX_VALUE ? -1 : min;
    }
}