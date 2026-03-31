class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                int first = st.pop();
                int second = st.pop();
                int res = 0;
                if(token.equals("+")){
                    res = first+second;
                }else if(token.equals("-")){
                    res = second-first;
                }else if(token.equals("*")){
                    res = first*second;
                }else{
                    res = second/first;
                }

                st.push(res);
            }else{
                int val = Integer.parseInt(token);
                st.push(val);
                
            }
        }
        return st.pop();
    }
}