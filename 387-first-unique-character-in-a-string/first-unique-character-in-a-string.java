class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        int idx = -1;
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(mp.get(c) == 1){
                idx = i;
                break;
            }
        }
        return idx;
    }
}