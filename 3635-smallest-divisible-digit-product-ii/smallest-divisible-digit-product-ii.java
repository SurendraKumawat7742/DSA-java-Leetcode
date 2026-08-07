class Solution {
    public long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public String smallestNumber(String num, long t) {
        int n = num.length();
        long temp = t;
        for(int i=2; i<=9; i++){
            while(temp%i == 0){
                temp /= i;
            }
        }
        if(temp > 1){
            return "-1";
        }

        long[] rem = new long[n+1];
        rem[0] = t;
        int pos = n-1;
        char[] c = num.toCharArray();
        for(int i=0; i<n; i++){
            if(c[i] == '0'){
                pos = i;
                break;
            }
            rem[i+1] = rem[i]/gcd(rem[i], c[i]-'0');
        }
        if(rem[n] == 1){
            return num;
        }

        for(int i=pos; i>=0; i--){
            while(++c[i] <= '9'){
                long tNow = rem[i]/gcd(rem[i], c[i]-'0');
                int k = 9;
                for(int j=n-1; j>i; j--){
                    while(tNow%k != 0){
                        k--;
                    }
                    tNow /= k;
                    c[j] = (char)('0'+k);
                }
                if(tNow == 1){
                    return new String(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        long oriT = t;
        for(int i=9; i>1; i--){
            while(oriT%i == 0){
                sb.append((char)('0'+i));
                oriT /= i;
            }
        }
        int rema = Math.max(n+1-sb.length(), 0);
        for(int i=0; i<rema; i++){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}