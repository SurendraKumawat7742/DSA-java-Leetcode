class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
           for (int i = 0; i < arr.length - 2; i++) {
            int product = arr[i] * arr[i + 1] * arr[i + 2];
            // Check if the product is odd
            if (product % 2 == 1) return true;
        }
        return false;
    }
}