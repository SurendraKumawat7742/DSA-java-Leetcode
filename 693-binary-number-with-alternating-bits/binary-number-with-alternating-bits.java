class Solution {
    public boolean hasAlternatingBits(int n) {
    //1st
        // String bit = Integer.toBinaryString(n);
        // for(int i=0; i<bit.length()-1; i++){
        //     if(bit.charAt(i) == bit.charAt(i+1)){
        //         return false;
        //     }
        // }
        // return true;


    //2nd
        int curr = n%2;
        n /= 2;
        while(n > 0){
            if(curr == n%2){
                return false;
            }
            curr = n%2;
            n /= 2;
        }
        return true;
    }
}