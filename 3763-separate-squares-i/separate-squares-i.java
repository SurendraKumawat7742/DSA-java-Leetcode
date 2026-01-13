class Solution {
    public double separateSquares(int[][] squares) {
        double totalArea = 0;
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        for(int[] square : squares){
            double len = square[2];
            totalArea += len*len;
            min = Math.min(min, square[1]);
            max = Math.max(max, len+square[1]);
        }
        double low = min, high = max;
        double target = totalArea/2;
        while(low < high){
            if(high-low < Math.pow(10, -5)){
                break;
            }
            double mid = (high+low)/2;
            if(checkBelow(mid, squares) < target){
                low = mid;
            }else{
                high = mid;
            }
        }
        return low;
    }
    public double checkBelow(double mid, int[][] squares){
        double area = 0;
        for(int[] square : squares){
            double len = square[2], y = square[1];
            if(mid >= y+len){
                area += len*len;
            }else if((mid > y) && (mid < y+len)){
                area += len*(mid-y);
            }
        }
        return area;
    }
}