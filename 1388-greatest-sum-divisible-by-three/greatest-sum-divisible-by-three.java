class Solution {
    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int min1_1 = Integer.MAX_VALUE, min2_1 = Integer.MAX_VALUE;
        int min1_2 = Integer.MAX_VALUE, min2_2 = Integer.MAX_VALUE;

        for(int num : nums){
            sum += num;
            int r = num%3;

            if(r == 1){
                if(num < min1_1){
                    min2_1 = min1_1;
                    min1_1 = num;
                }else if(num < min2_1){
                    min2_1 = num;
                }
            }else if(r == 2){
                if(num < min1_2){
                    min2_2 = min1_2;
                    min1_2 = num;
                }else if(num < min2_2){
                    min2_2 = num;
                }
            }
        }

        if(sum%3 == 0){
            return sum;
        }
        int rem = sum%3;
        int res = 0;

        if(rem == 1){
            int opti1 = min1_1;
            int opti2 = (min1_2 == Integer.MAX_VALUE || min2_2 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : min1_2 + min2_2;

            res = sum - Math.min(opti1, opti2);
        }else{
            int opti1 = min1_2;
            int opti2 = (min1_1 == Integer.MAX_VALUE || min2_1 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : min1_1 + min2_1;

            res = sum - Math.min(opti1, opti2);
        }

        return res<0? 0: res;
    }
}