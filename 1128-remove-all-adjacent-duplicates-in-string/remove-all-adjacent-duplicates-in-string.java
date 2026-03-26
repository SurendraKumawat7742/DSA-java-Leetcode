class Solution {
    public String removeDuplicates(String s) {

    //1st
        // int n = s.length();
        // Stack<Character> st = new Stack<>();
        // StringBuilder sb = new StringBuilder();
        // for(char c : s.toCharArray()){
        //     if(!st.isEmpty() && c == st.peek()){
        //         st.pop();
        //     }else{
        //         st.push(c);
        //     }
        // }
        // while(!st.isEmpty()){
        //     sb.append(st.pop());
        // }

        // return sb.reverse().toString();


    //2nd
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            int l = sb.length();

            if(l > 0 && sb.charAt(l-1) == c){
                sb.deleteCharAt(l-1);
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}