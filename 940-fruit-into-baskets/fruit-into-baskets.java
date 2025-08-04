class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int st=0, end=0;
        int maxLen = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        while(end < n){
            mp.put(fruits[end], mp.getOrDefault(fruits[end], 0)+1);
            while(mp.size() >= 3){
                mp.put(fruits[st], mp.get(fruits[st])-1);
                if(mp.get(fruits[st]) == 0){
                    mp.remove(fruits[st]);
                }
                st++;
            }
            int currLen = end-st+1;
            maxLen = Math.max(maxLen, currLen);
            end++;
        }
        return maxLen;
    }
}