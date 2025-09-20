class Solution {
    public int singleNumber(int[] nums) {
//1st
        // Map<Integer, Integer> mp = new HashMap<>();
        // for(int n : nums){
        //     mp.put(n, mp.getOrDefault(n,0)+1);
        // }
        // for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
        //     if(entry.getValue() == 1){
        //         return entry.getKey();
        //     }
        // }
        // return -1;

//2nd
        int one=0;
        int two=0;

        for(int num:nums){
            one=(one^num)&~two;
            two=(two^num)&~one;
        }
        return one;
    }
}