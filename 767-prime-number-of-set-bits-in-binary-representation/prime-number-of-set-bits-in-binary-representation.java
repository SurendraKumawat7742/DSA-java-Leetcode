class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        for(int i=left; i<=right; i++){
            int total = Integer.bitCount(i);
            if(checkPrime(total)){
                cnt++;
            }
        }
        return cnt;
    }
    public boolean checkPrime(int n){
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}