class Solution {
    public int minAddToMakeValid(String s) {
    //1st
        // int n = s.length();
        // Stack<Character> st = new Stack<>();
        // for(int i=0; i<n; i++){
        //     char c = s.charAt(i);
        //     if(!st.isEmpty() && (st.peek()=='(' && c == ')')){
        //         st.pop();
        //     }else{
        //         st.push(c);
        //     }
        // }
        // return st.size();


    //2nd
        int o = 0 , c = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                o++;
            }else{
                if(o > 0){
                    o--;
                }else{
                    c++;
                }
            }
        }
        return o+c;
    }
}