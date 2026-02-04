class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length -1, area = 0, maxArea = 0;
        
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            area = h * Math.abs(i - j);
            maxArea = Math.max(area, maxArea);
            while (i<j && height[i] <= h) {
                i++;
            }
            while (i<j && height[j] <= h) {
                j--;
            }
        }
        return maxArea;
    }
}