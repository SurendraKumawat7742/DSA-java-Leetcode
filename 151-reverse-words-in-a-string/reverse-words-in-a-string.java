class Solution {
    public String reverseWords(String s) {
        int n = s.length();
       String[] arr = s.split("\\s+");
       StringBuilder sb = new StringBuilder();
       for(int i=arr.length-1; i>=0; i--){
        sb.append(arr[i]);
        if(i != 0){
            sb.append(" ");
        }
       }
       return sb.toString().trim();
    }
}