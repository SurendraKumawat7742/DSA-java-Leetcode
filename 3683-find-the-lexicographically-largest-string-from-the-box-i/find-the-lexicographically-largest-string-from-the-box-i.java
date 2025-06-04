class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends == 1){
            return word;
        }
        int n = word.length();
        String res = "";
        for(int i=0; i<n; i++){
            String curr = word.substring(i);
            if(res.isEmpty() || curr.compareTo(res) > 0){
                res = curr;
            }
        }
        int size = n-numFriends+1;
        return res.substring(0,Math.min(res.length() , size));
    }
}