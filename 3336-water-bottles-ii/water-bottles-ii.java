class Solution {
    public int maxBottlesDrunk(int numB, int numE) {
        int res = numB;
        while(numB >= numE){
            res++;
            numB -= numE-1;
            numE++;
        }
        return res;
    }
}