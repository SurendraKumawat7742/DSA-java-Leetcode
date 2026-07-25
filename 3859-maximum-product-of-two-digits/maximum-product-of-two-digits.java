class Solution {
    public int maxProduct(int n) {
        int k = n;
        int firstMax = 0, secondMax =0 ;
        while(k > 0){
            int rem = k%10;
            if(rem > firstMax){
                secondMax = firstMax;
                firstMax = rem;
            }else if(rem > secondMax){
                secondMax = rem;
            }
            k /= 10;
        }
        return firstMax*secondMax;
    }
}