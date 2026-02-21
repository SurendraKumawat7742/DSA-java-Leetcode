class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        for(int i=left; i<=right; i++){
            int total = Integer.bitCount(i);
            if(total == 2 || total == 3 ||total == 5 ||total == 7 ||total == 11 ||total == 13 ||total == 17 ||total == 19 ||total == 23 ||total == 29 ||total == 31 ){
                cnt++;
            }
        }
        return cnt;
    }
}