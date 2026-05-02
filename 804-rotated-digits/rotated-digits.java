class Solution {
    public int rotatedDigits(int n) {
        int cnt = 0;
        for(int i=1; i<=n; i++){
            int num = i;
            boolean isValid = true;
            boolean hasChange = false;

            while(num > 0){
                int rem = num%10;
                if(rem==3 || rem==4 || rem==7){
                    isValid = false;
                    break;
                }
                if(rem==2 || rem==5 || rem==6 || rem==9){
                    hasChange = true;
                }
                num /= 10;
            }
            if(isValid && hasChange){
                cnt++;
            }
        }
        return cnt;
    }
}