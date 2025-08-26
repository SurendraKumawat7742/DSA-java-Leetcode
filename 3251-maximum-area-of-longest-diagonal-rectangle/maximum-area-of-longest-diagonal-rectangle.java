class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int n = d.length;
        double[] a1 = new double[n];
        double[] a2 = new double[n];
        for(int i=0; i<n; i++){
            int n1 = d[i][0];
            int n2 = d[i][1];
            a1[i] = Math.sqrt(((n1*n1)+(n2*n2)));
            a2[i] = n1*n2;
        }
        double max = a1[0];
        int idx = 0;
        for(int i=1; i<n; i++){
            if(a1[i] > max){
                max = a1[i];
                idx = i;
            }else if(a1[i] == max){
                if(a2[idx] < a2[i]){
                    idx = i;
                }
            }
        }
        return (int)a2[idx];
    }
}