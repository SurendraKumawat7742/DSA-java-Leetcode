class Solution {
    public int firstUniqChar(String s) {
//1st
        // Map<Character, Integer> mp = new HashMap<>();
        // int n = s.length();
        // for(int i=0; i<n; i++){
        //     char c = s.charAt(i);
        //     mp.put(c, mp.getOrDefault(c,0)+1);
        // }
        // int idx = -1;
        // for(int i=0; i<n; i++){
        //     char c = s.charAt(i);
        //     if(mp.get(c) == 1){
        //         idx = i;
        //         break;
        //     }
        // }
        // return idx;

//2nd
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a'] == 0) {
                q.add(ch);
            }
            freq[ch - 'a']++;
        }
        while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
            q.remove();
        }
        for (int i = 0;i<s.length();i++) {
            if(q.isEmpty()) break;
            if (s.charAt(i) == q.peek()) {
                return i;
            } 
        }
        
        return -1;
    }
}