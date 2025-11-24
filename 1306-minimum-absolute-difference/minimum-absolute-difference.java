class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        int minDiff = Math.abs(arr[0]-arr[1]);
        for(int i=0; i<n-1; i++){
            minDiff = Math.min(minDiff, Math.abs(arr[i]-arr[i+1]));
        }

        for(int i=0; i<n-1; i++){
            if(Math.abs(arr[i]-arr[i+1]) == minDiff){
                res.add(Arrays.asList(arr[i], arr[i+1]));            
            }
        }
        return res;
    }
}