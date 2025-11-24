class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n = nums.length;
        List<Boolean> list = new ArrayList<>();
        int prefix = 0;
        for(int num : nums){
            prefix = ((prefix<<1) + num)%5;
            list.add(prefix == 0);
        }
        return list;
    }
}