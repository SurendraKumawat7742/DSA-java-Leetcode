class Solution {
    public int maxFrequencyElements(int[] nums) {
//1st
        // int m = nums.length;
        // Map<Integer, Integer> mp = new HashMap<>();
        // for(int i=0; i<m; i++){
        //     mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        // }
        // int max = 0;
        // for(int n : nums){
        //     max = Math.max(max, mp.get(n));
        // }
        // int res = 0;
        // for(int n : mp.values()){
        //     if(n == max){
        //         res += n;
        //     }
        // }
        // return res;

//2nd
        int[] freq=new int[101];
        int maxFreq=0;
        for(int num:nums){
            freq[num]++;
            if(freq[num]>maxFreq){
                maxFreq=freq[num];
            }
        }
        int result=0;
        for(int f:freq){
            if(f==maxFreq){
                result+=f;
            }
        }
        return result;
    }
}