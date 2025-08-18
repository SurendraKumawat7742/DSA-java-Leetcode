class Solution {
    // public boolean judgePoint24(int[] cards) {
    //     int n = cards.length;
    //     double[] num = new double[n];
    //     for(int i=0; i<n; i++){
    //         num[i] = (double)cards[i];
    //     }
    //     return solve(num);
    // }
    // public boolean solve(double[] num){
    //     int n = num.length;
    //     if(n == 1){
    //         return Math.abs(num[0]-24.0) < 0.000001;
    //     }
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<n; j++){
    //             if(i != j){
    //                 double[] next = new double[n-1];
    //                 int idx = 0;
    //                 for(int k=0; k<n; k++){
    //                     if(k != i && k != j){
    //                         next[idx++] = num[k];
    //                     }
    //                 }
    //                 for(double val : compute(num[i], num[j])){
    //                     next[next.length-1] = val;
    //                     if(solve(next)){
    //                         return true;
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public double[] compute(double a, double b){
    //     return new double[]{
    //         a+b,a-b,b-a,a*b,
    //         b!=0?a/b:Double.NaN,
    //         a!=0?b/a:Double.NaN,
    //     };
    // }


//2nd
        private static final double EPS = 1e-6;
    private boolean backtrack(double[] A, int n) {
        if(n == 1) return Math.abs(A[0] - 24) < EPS;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                double a = A[i], b = A[j];
                A[j] = A[n-1];
                A[i] = a + b;
                if(backtrack(A, n - 1)) return true;
                A[i] = a - b;
                if(backtrack(A, n - 1)) return true;
                A[i] = b - a;
                if(backtrack(A, n - 1)) return true;
                A[i] = a * b;
                if(backtrack(A, n - 1)) return true;
                if(Math.abs(b) > EPS) {
                    A[i] = a / b;
                    if(backtrack(A, n - 1)) return true;
                }
                if(Math.abs(a) > EPS) {
                    A[i] = b / a;
                    if(backtrack(A, n - 1)) return true;
                }
                A[i] = a; A[j] = b;
            }
        }
        return false;
    }
    public boolean judgePoint24(int[] nums) {
        double[] A = new double[nums.length];
        for(int i = 0; i < nums.length; i++) A[i] = nums[i];
        return backtrack(A, A.length);
    }
}