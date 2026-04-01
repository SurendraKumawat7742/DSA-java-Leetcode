class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        int[][] arr = new int[n][4];
        for(int i=0; i<n; i++){
            arr[i][0] = positions[i];
            arr[i][1] = healths[i];
            arr[i][2] = directions.charAt(i);
            arr[i][3] = i;
        }
        Arrays.sort(arr, (a,b) -> a[0]-b[0]);

        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[i][2]=='L' && arr[i][1]>0 && arr[st.peek()][2]=='R'){
                if(arr[i][1] == arr[st.peek()][1]){
                    arr[st.pop()][1] = 0;
                    arr[i][1] = 0;
                }else if(arr[i][1] < arr[st.peek()][1]){
                    arr[st.peek()][1] -= 1;
                    arr[i][1] = 0;
                }else{
                    arr[st.pop()][1] = 0;
                    arr[i][1] -= 1;
                }
            }
            if(arr[i][1] > 0){
                st.push(i);
            }
        }

        int[] res = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i][1] > 0){
                res[arr[i][3]] = arr[i][1];
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(res[i] > 0){
                ans.add(res[i]);
            }
        }
        return ans;
    }
}