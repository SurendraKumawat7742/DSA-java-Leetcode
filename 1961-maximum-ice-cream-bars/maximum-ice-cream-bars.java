class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        int cnt = 0;
        int coin = coins;
        int i=0;
        while(i < n && coin > 0 && costs[i] <= coin){
            cnt++;
            coin -= costs[i];
            i++;
        }
        return cnt;
    }
}