class Solution {
    public boolean checkStrings(String s1, String s2) {
    //1st
        // int n = s1.length();
        // Map<Character, Integer> mpE = new HashMap<>();
        // Map<Character, Integer> mpO = new HashMap<>();

        // for(int i=0; i<n; i++){
        //     char first = s1.charAt(i);
        //     char second = s2.charAt(i);
        //     if(i%2 == 0){
        //         mpE.put(first, mpE.getOrDefault(first, 0)+1);
        //         mpE.put(second, mpE.getOrDefault(second, 0)-1);
        //     }else{
        //         mpO.put(first, mpO.getOrDefault(first, 0)+1);
        //         mpO.put(second, mpO.getOrDefault(second, 0)-1);
        //     }
        // }
        // for(Map.Entry<Character, Integer> entry : mpE.entrySet()){
        //     int val = entry.getValue();
        //     if(val != 0){
        //         return false;
        //     }
        // }
        // for(Map.Entry<Character, Integer> entry : mpO.entrySet()){
        //     int val = entry.getValue();
        //     if(val != 0){
        //         return false;
        //     }
        // }
        // return true;

    
    //2nd
        int n = s1.length();
        int[][] cnt = new int[2][26];
        for(int i=0; i<n; i++){
            cnt[i%2][s1.charAt(i)-'a']++;
            cnt[i%2][s2.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(cnt[0][i]!=0 || cnt[1][i]!=0){
                return false;
            }
        }

        return true;
    }
}