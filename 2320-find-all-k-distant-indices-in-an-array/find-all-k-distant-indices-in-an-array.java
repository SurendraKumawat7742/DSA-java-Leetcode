class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int j = 0;
        int s = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == key){
                j=i;
            
            for(int l=s; l<n; l++){
                if(Math.abs(l-j) <= k){
                    res.add(l);
                    s = l+1;
                }
            }
            }
        }
        Collections.sort(res);
        return res;
    }
}