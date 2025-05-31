/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let max = 0;
    let i = 0;
    let j = height.length - 1;
    while(i < j){
        let width = j-i;
        let h = Math.min(height[i] , height[j]);
        let area = h * width;
        max = Math.max(max , area);
        if(height[i] < height[j]){
            i++;
        }else{
            j--;
        }
    }
    return max;
};