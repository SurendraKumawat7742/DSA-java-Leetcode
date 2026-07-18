class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int div = min;
        while(div > 1){
            if(min%div == 0 && max%div == 0){
                break;
            }else{
                div--;
            }

        }
        return div;
    }
}