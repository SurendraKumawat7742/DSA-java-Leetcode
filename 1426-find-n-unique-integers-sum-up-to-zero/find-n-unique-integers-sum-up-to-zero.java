class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int j = 0;
        if(n%2 == 0){
            int mid = n/2;
            for(int i=1; i<=mid; i++){
                res[j] = -i;
                j++;
            }
            for(int i=1; i<=mid; i++){
                res[j] = i;
                j++;
            }
        }else{
            int mid = n/2;
            for(int i=1; i<=mid; i++){
                res[j] = -i;
                j++;
            }
            for(int i=0; i<=mid; i++){
                res[j] = i;
                j++;
            }
        }
        return res;
    }
}