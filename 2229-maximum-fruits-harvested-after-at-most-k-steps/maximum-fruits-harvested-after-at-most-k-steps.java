class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int left = 0 , right = 0;
        int sum = 0;
        int ans = 0;
        while(right < n){
            sum += fruits[right][1];
            while(left <= right && step(fruits, startPos, left, right)>k){
                sum -= fruits[left][1];
                left++;
            }
            ans = Math.max(ans, sum);
            right++;
        }
        return ans;
    }
    public int step(int[][] fruits, int stPos, int left, int right){
        int rightStep = Math.abs(stPos-fruits[right][0]);
        int leftStep = Math.abs(stPos-fruits[left][0]);
        return (Math.min(rightStep,leftStep)+fruits[right][0]-fruits[left][0]);
    }
}