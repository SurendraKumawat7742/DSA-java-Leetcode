class Solution {
    public int lengthOfLastWord(String s) {
//1st
        // String[] words = s.split(" ");
        // return words[words.length-1].length();

//2nd
        boolean found = false;   
        int count = 0;          
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
                found = true;
            } else if (found) {
                break;
            }
        }
        return count;
    }
}