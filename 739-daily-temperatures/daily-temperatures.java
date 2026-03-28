class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;

    //1st : worst
        // int[] res = new int[n];

        // for(int i=0; i<n; i++){
        //     int j=i, cnt = 0;
        //     while(j < n && temp[i] >= temp[j]){
        //         j++;
        //         cnt++;
        //     }

        //     if(j < n && temp[j] > temp[i]){
        //         res[i] = cnt;
        //     }else{
        //         res[i] = 0;
        //     }
        // }
        // return res;


    //2nd
        // int[] res = new int[n];
        // res[n-1] = 0;
        // Stack<Integer> st = new Stack<>();
        // st.push(n-1);

        // for(int i=n-2; i>=0; i--){
        //     while(!st.isEmpty() && temp[i]>=temp[st.peek()]){
        //         st.pop();
        //     }
        //     if(st.isEmpty()){
        //         res[i] = 0;
        //     }else{
        //         res[i] = st.peek() - i;
        //     }

        //     st.push(i);
        // }
        // return res;


    //3rd
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && temp[i] > temp[st.peek()]){
                int idx = st.pop();
                res[idx] = i-idx;
            }

            st.push(i);
        }

        return res;
    }
}