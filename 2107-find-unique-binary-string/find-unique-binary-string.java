class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> inte = new HashSet<>();
        for(String num : nums){
            inte.add(Integer.parseInt(num, 2));
        }

        int n = nums.length;
        for(int i=0; i<=n; i++){
            if(!inte.contains(i)){
                String res = Integer.toBinaryString(i);
                while(res.length() < n){
                    res = "0" + res;
                }
                return res;
            }
        }
        return "";
    }
}