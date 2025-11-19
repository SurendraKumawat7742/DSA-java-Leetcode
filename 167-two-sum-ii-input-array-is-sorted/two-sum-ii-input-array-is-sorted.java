class Solution {
    public int[] twoSum(int[] num, int target) {
        int n = num.length;
        int left = 0, right = n-1;
        while(left < right){
            if(num[left]+num[right] == target){
                return new int[]{left+1, right+1};
            }else if(num[left]+num[right] > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{0,0};
    }
}