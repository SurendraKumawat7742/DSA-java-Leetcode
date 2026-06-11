class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] res = new int[n];
        int less = 0;
        int great = n - 1;
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (nums[i] < pivot) {
                res[less] = nums[i];
                less++;
            }
            if (nums[j] > pivot) {
                res[great] = nums[j];
                great--;
            }
        }
        while (less <= great) {
            res[less] = pivot;
            less++;
        }
        return res;
    }
}