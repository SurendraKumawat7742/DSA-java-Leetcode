
class Solution {
    public int numSteps(String s) {
        int n = s.length();
        int res = 0;
        int carry = 0;
        for(int i=n-1; i>0; i--){
            int num = Character.getNumericValue(s.charAt(i))+carry;
            if(num%2 == 1){
                res += 2;
                carry = 1;
            }else{
                res += 1;
            }
        }
        return res+carry;
    }
}