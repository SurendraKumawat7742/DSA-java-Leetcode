class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int abs = Integer.MAX_VALUE;
        for(int j=0; j<n; j++){
            // int rev = reverse(nums[j]);
            if(map.containsKey(nums[j])){
                int i = map.get(nums[j]);
                abs = Math.min(abs, Math.abs(j-i));
            }
            map.put(reverse(nums[j]), j);
        }
        return abs == Integer.MAX_VALUE ? -1 : abs;
    }
    public int reverse(int x){
        int n = 0;
        while(x > 0){
            int rem = x%10;
            n = n*10 + rem;
            x /= 10;
        }
        return n;
    }
}