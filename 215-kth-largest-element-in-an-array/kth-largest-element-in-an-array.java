class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> b-a
        );
        for(int num : nums){
            pq.offer(num);
        }

        int res = 0;
        while(k-- > 0){
            res = pq.poll();
        }
        return res;
    }
}