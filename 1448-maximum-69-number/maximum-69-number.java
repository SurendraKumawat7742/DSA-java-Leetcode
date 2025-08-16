class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '6' && cnt < 1){
                c = '9';
                cnt++;
            }
            sb.append(c);
        }
        String st = sb.toString();
        return Integer.valueOf(st);
    }
}