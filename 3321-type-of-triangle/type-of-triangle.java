class Solution {
    public String triangleType(int[] nums) {
        int n = nums.length;
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        boolean isTrue = false;
        if((a+b > c) && (b+c) > a && (a+c) > b){
            isTrue = true;
        } 
        if(isTrue){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        if(set.size() == 1){
            return  "equilateral";
        }else if(set.size() == 2){
             return  "isosceles";
        }else{
             return  "scalene";
        }
        }else{
            return "none";
        }
    }
}