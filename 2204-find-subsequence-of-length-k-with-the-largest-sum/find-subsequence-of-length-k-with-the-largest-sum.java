class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        if(n == k){
            return nums;
        }
        int[] res = new int[k];
        int[][] aux = new int[n][2];
        for(int i=0; i<n; i++){
            aux[i][0] = i;
            aux[i][1] = nums[i];
        }
        //sort in descending order
        Arrays.sort(aux,(x1,x2)->Integer.compare(x2[1],x1[1]));
        //sort first k elements based on index
        Arrays.sort(aux,0,k,(x1,x2)->Integer.compare(x1[0],x2[0]));
        for(int i=0; i<k; i++){
            res[i] = aux[i][1];
        }
        return res;
    }
}