class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int max = -1;
        int count = 1;
        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                if(arr[i-1] == count){
                    max = Math.max(max,count);
                }
                count = 1;
            }
        }
        if(arr[n-1] == count){
            max = Math.max(max,count);
        }
        return max;
    }
}