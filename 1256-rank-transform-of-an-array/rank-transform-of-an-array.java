class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        int rank = 1;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : sortedArr){
            if(!mp.containsKey(num)){
                mp.put(num, rank++);
            }
        }
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i] = mp.get(arr[i]);
        }
        return ans;
    }
}