class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int sLen = s.length();
        int pLen = p.length();
        if(sLen < pLen){
            return list;
        }

        int[] pCnt = new int[26];
        int[] sCnt = new int[26];
        for(int i=0; i<pLen; i++){
            pCnt[p.charAt(i)-'a']++;
            sCnt[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(sCnt, pCnt)){
            list.add(0);
        }
        for(int i=pLen; i<sLen; i++){
            sCnt[s.charAt(i)-'a']++;
            sCnt[s.charAt(i-pLen)-'a']--;

            if(Arrays.equals(sCnt, pCnt)){
                list.add(i-pLen+1);
            }
        }
        return list;
    }
}