class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }
        char res = ' ';
        for(Map.Entry<Character, Integer> entry : mp.entrySet()){
            if(entry.getValue()%2 == 1){
                res = entry.getKey();
                break;
            }
        }
        return res;
    }
}