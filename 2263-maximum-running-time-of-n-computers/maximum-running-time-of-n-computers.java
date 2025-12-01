class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sumPower = 0;
        for (int p : batteries)
            sumPower += p;
        long left = 1, right = sumPower / n;
        
        while (left < right){
            long target = right - (right - left) / 2;
            long extra = 0;
            
            for (int p : batteries)
                extra += Math.min(p, target);

            if (extra >= (long)(n * target))
                left = target;
            else
                right = target - 1;
        }
        return left;
    }
}