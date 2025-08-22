class Solution {
    public int findKthLargest(int[] nums, int k) {
//1st
    //     Arrays.sort(nums);
    //    for(int i = nums.length-1;i>=0;i--){
    //      k--;
    //      if(k==0){
    //         return nums[i];
    //      }
    //    } 
    //    return 0;

//2nd
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : nums){
            pq.add(x);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}