class Solution {
    public int triangularSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int i=0;
        List<Integer> first = new ArrayList<>();
        for(int F : nums){
            first.add(F);
        }
        res.add(first);

        while(n > 1){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<res.get(i).size()-1; j++){
                int l = res.get(i).get(j);
                int m = res.get(i).get(j+1);
                list.add((l+m)%10);
            }
            res.add(list);
            n--;
            i++;
        }
        int k = res.get(res.size()-1).get(0);
        return k;
    }
}