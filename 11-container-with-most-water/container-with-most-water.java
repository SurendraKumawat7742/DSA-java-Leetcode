class Solution {
    public int maxArea(int[] height) {
//1st
    //    int max = 0;
    //    int i=0;
    //    int j=height.length-1;
    //    while(i<j){
    //     int width = j-i;
    //     int ht = Math.min(height[i],height[j]);
    //     int area = width*ht;
    //     max = Math.max(max,area);
    //     if(height[i]<height[j]){
    //         i++;
    //     }else{
    //         j--;
    //     }
    //    }
    //   return max;


//2nd
        int i = 0, j = height.length -1, area = 0, maxArea = 0;
        
        while (i < j) {
            int min = Math.min(height[i], height[j]);
            area = min * Math.abs(i - j);
            maxArea = Math.max(area, maxArea);
            while (i<j && height[i] <= min) {
                i++;
            }
            while (i<j && height[j] <= min) {
                j--;
            }
        }
        return maxArea;
    }
}