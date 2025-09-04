class Solution {
    public int findClosest(int x, int y, int z) {
//1st
        // if(Math.abs(z-x) < Math.abs(z-y)){
        //     return 1;
        // }else if(Math.abs(z-x) > Math.abs(z-y)){
        //     return 2;
        // }else{
        //     return 0;
        // }

//2nd
        int a = Math.abs(z-x);
        int b=Math.abs(z-y);
        if(a==b)
        {
            return 0;
        }
          if(a<b) return 1;
          else  return 2;
    }
}