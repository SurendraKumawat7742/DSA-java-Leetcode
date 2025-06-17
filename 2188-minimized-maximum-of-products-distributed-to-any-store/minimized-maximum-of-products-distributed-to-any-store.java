class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int x= quantities.length;
       // Arrays.sort(quantities);
        int low = 1;
        int high = 0;
        for(int lol : quantities)
        {
            high = Math.max(high,lol);
        }
        int ans = 0;
        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(ifPossible(n,quantities,mid))
            {
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
       return ans; 
    }
    private boolean ifPossible(int n , int quantities[],int ans)
    {
        int count = 0;

        for(int i = 0 ; i < quantities.length;i++)
        {
         count += (quantities[i] + ans - 1) / ans;
        } 
       return count<=n;
    }
}
