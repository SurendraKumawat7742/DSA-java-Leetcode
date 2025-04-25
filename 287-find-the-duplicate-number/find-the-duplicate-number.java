class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int x = 0;
        for(int i : nums){
            if(set.contains(i)){
                x = i;
                break;
            }
            set.add(i);
        }
        return x;
    }
}