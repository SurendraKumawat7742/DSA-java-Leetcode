class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        int st = 0;
        int end = address.length()-1;
        while(st <= end){
            char c = address.charAt(st);
            if(c == '.'){
                sb.append("[.]");
            }else{
                sb.append(c);
            }
            st++;
        }
        return sb.toString();
    }
}