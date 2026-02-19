class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();

        //1st Approach
        // ArrayList<Integer> list = new ArrayList<>();
        // int cnt = 1;
        // for(int i=1; i<n; i++){
        //     char c = s.charAt(i);
        //     char prev = s.charAt(i-1);
        //     if(c == prev){
        //         cnt++;
        //     }else{
        //         list.add(cnt);
        //         cnt = 1;
        //     }
        // }
        // list.add(cnt);
        // if(list.size() == 1){
        //     return 0;
        // }

        // int res = 0;
        // for(int i=1; i<list.size(); i++){
        //     int min = Math.min(list.get(i), list.get(i-1));
        //     res += min;
        // }
        // return res;

        //2nd Approach
        int res = 0, prev = 0, curr = 1;
        for(int i=1; i<n; i++){
            if(s.charAt(i) != s.charAt(i-1)){
                res += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }else{
                curr++;
            }
        }
        return res + Math.min(prev, curr);
    }
}