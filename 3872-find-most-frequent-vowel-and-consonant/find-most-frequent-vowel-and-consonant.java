class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> mpV = new HashMap<>();
        Map<Character, Integer> mpC = new HashMap<>();

        int i = 0;
        int maxV = 0;
        int maxC = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                mpV.put(c, mpV.getOrDefault(c,0)+1);
                maxV = Math.max(maxV, mpV.get(c));
            }else{
                mpC.put(c, mpC.getOrDefault(c,0)+1);
                maxC = Math.max(maxC, mpC.get(c));
            }
            i++;
        }
        return maxV+maxC;
    }
}