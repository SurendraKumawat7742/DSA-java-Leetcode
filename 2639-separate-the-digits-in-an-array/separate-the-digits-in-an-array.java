class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            ArrayList<Integer> list = rev(nums[i]);
            for(int j=list.size()-1; j>=0; j--){
                ans.add(list.get(j));
            }
        }
        int[] res = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            res[i] = ans.get(i);
        }

        return res;
    }
    public ArrayList<Integer> rev(int n){
        ArrayList<Integer> list = new ArrayList<>();

        while(n > 0){
            int rem = n%10;
            list.add(rem);
            n /= 10;
        }
        return list;
    }
}