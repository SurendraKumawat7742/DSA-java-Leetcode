class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int curr = 0;
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(curr);
                curr = 0;
            }else{
                curr = st.pop() + Math.max(2*curr, 1);
            }
        }
        return curr;
    }
}