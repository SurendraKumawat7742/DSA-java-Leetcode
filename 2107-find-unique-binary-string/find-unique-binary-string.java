class Solution {
    public String findDifferentBinaryString(String[] nums) {

    //1st
        // Set<Integer> inte = new HashSet<>();
        // for(String num : nums){
        //     inte.add(Integer.parseInt(num, 2));
        // }

        // int n = nums.length;
        // for(int i=0; i<=n; i++){
        //     if(!inte.contains(i)){
        //         String res = Integer.toBinaryString(i);
        //         while(res.length() < n){
        //             res = "0" + res;
        //         }
        //         return res;
        //     }
        // }
        // return "";


    //2nd
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<nums.length; i++){
            sb.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }
        return sb.toString();
    }
}