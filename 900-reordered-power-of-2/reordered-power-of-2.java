class Solution {
    public boolean reorderedPowerOf2(int n) {
        char[] original = sortDigits(n);
        for(int i=0; i<30; i++){
            int powerOfTwo = 1 << i;
            if(Arrays.equals(original, sortDigits(powerOfTwo))){
                return true;
            }
        }
        return false;
    }
    public char[] sortDigits(int num){
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return digits;
    }
}