class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;
        while(true){
            int k = i;
            int pro = 1;
            while(k > 0){
                int rem = k%10;
                pro *= rem;
                k /= 10;
            }
            if(pro%t == 0){
                return i;
            }
            i++;
        }
    }
}