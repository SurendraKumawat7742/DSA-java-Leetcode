class Solution {
//1st
    // public int[] separateDigits(int[] nums) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     for(int i=0; i<nums.length; i++){
    //         ArrayList<Integer> list = rev(nums[i]);
    //         for(int j=list.size()-1; j>=0; j--){
    //             ans.add(list.get(j));
    //         }
    //     }
    //     int[] res = new int[ans.size()];
    //     for(int i=0; i<ans.size(); i++){
    //         res[i] = ans.get(i);
    //     }

    //     return res;
    // }
    // public ArrayList<Integer> rev(int n){
    //     ArrayList<Integer> list = new ArrayList<>();

    //     while(n > 0){
    //         int rem = n%10;
    //         list.add(rem);
    //         n /= 10;
    //     }
    //     return list;
    // }

//2nd
    public int[] separateDigits(int[] nums) {
        int totDig = 0;
        for(int n : nums){
            int temp = n;
            if(temp == 0){
                totDig++;
            }else{
                while(temp > 0){
                    totDig++;
                    temp /= 10;
                }
            }
        }

        int[] res = new int[totDig];
        int idx = totDig-1;

        for(int i=nums.length-1; i>=0; i--){
            int n = nums[i];
            if(n == 0){
                res[idx--] = 0;
            }else{
                while(n > 0){
                    res[idx--] = n%10;
                    n /= 10;
                }
            }
        }

        return res;
    }
}