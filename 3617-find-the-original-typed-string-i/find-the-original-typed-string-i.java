class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        // Map<Character,Integer> mp = new HashMap<>();
        // for(int i=0; i<n; i++){
        //     char ch = word.charAt(i);
        //     mp.put(ch,mp.getOrDefault(ch,0)+1);
        // }
        // int count = 1;
        // for(int i=0; i<mp.size(); i++){
        //     // char ch = word.charAt(i);
        //     int m = mp.get();
        //     if(m > 1){
        //         count += m-1;
        //     }
        // }

        int cnt = 1;
        for(int i=1; i<n; i++){
            if(word.charAt(i-1) == word.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
}