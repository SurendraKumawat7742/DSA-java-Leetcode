/**
 * @param {number[]} nums
 * @return {string}
 */
var triangleType = function(nums) {
    
        let a = nums[0];
        let b = nums[1];
        let c = nums[2];
        if((a+b > c) && (b+c) > a && (a+c) > b){
          if(a==b && b==c) return "equilateral";
          else if(a==b || b==c || a==c) return "isosceles" ;
          else return "scalene";
        }else{
            return "none";
        }
};