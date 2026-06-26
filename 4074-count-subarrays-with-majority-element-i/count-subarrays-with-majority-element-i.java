class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;

        for (int l = 0; l < n; l++) {
            int tarCnt = 0;

            for (int r = l; r < n; r++) {
                if (nums[r] == target) {
                    tarCnt++;
                }

                int len = r - l + 1;

                if (tarCnt > len / 2) {
                    ans++;
                }
            }
        }

        return ans;
    }
}