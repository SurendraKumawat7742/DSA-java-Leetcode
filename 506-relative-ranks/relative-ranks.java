class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> p = new PriorityQueue();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<score.length; i++){
            p.add(score[i]);
            mp.put(score[i], i);
        }
        String[] res = new String[score.length];
        int cnt = score.length;
        while(!p.isEmpty()){
            int n = p.remove();
            int idx = mp.get(n);
            if(cnt <= 3){
                if(cnt == 1){
                    res[idx] = "Gold Medal";
                }
                if(cnt == 2){
                    res[idx] = "Silver Medal";
                }
                if(cnt == 3){
                    res[idx] = "Bronze Medal";
                }
            }else{
                res[idx] = String.valueOf(cnt);
            }
            cnt--;
        }
        return res;
    }
}