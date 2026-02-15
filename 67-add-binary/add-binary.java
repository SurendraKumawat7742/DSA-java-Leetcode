class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || cnt == 1){
            if(i >= 0){
                cnt += a.charAt(i--)-'0';
            }
            if(j >= 0){
                cnt += b.charAt(j--)-'0';
            }

            sb.append(cnt%2);
            cnt /= 2;
        }
        return sb.reverse().toString();
    }
}