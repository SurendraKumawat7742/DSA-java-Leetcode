class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int hmax = 1;
        int vmax = 1;
        int hcurr = 1;
        int vcurr = 1;
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        for(int i=1; i<hBars.length; i++){
            if(hBars[i] == hBars[i-1]+1){
                hcurr++;
            }else{
                hcurr = 1;
            }
            hmax = Math.max(hmax, hcurr);
        }
        for(int i=1; i<vBars.length; i++){
            if(vBars[i] == vBars[i-1]+1){
                vcurr++;
            }else{
                vcurr = 1;
            }
            vmax = Math.max(vmax, vcurr);
        }
        int side = Math.min(hmax, vmax)+1;
        return side*side;
    }
}