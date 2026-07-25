class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        int k = n;
        int i=0;
        while(k > 0){
            int rem = k%10;
            list.add(rem);
            k /= 10;
        }
        Collections.sort(list);
        return list.get(list.size()-1)*list.get(list.size()-2);
    }
}