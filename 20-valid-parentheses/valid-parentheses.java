class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < n){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }else if((st.peek()=='('&&c!=')'||(st.peek()=='{'&&c!='}')||(st.peek()=='['&&c!=']'))){
                    return false;
                }
                st.pop();
            }
            i++;
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}