class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        StringBuilder sb = new StringBuilder(strs[0]);
        for(int i=1; i<n; i++){
            String s = strs[i];
            int j = 0;
            while(j < s.length() && j < sb.length()){
                if(s.charAt(j) != sb.charAt(j)){
                    break;
                }
                j++;
            }

            sb.setLength(j);

            if(sb.length() == 0){
                return "";
            }
        }
        return sb.toString();
    }
}