class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        
        int pow = 1;
        while(n > 0){
            int rem = n%10;
            if(rem != 0){
                list.add(rem * pow);
            }
            n = n/10;
            pow *= 10;
        }
        int[] arr = new int[list.size()];
        int start = 0;
        int end = list.size()-1;
        while(start < arr.length){
            arr[start] = list.get(end);
            start++;
            end--;
        }
        return arr;
    }
        
}