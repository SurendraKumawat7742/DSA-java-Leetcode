class Solution {
    public int findKthLargest(int[] nums, int k) {
//1st
    Arrays.sort(nums);
    return nums[(nums.length) - k];

//2nd
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int x : nums){
        //     pq.add(x);
        //     if(pq.size() > k){
        //         pq.poll();
        //     }
        // }
        // return pq.peek();
    }
}