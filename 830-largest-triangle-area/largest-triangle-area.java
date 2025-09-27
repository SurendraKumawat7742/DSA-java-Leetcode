class Solution {
    public double largestTriangleArea(int[][] p) {
        int n = p.length;
        double maxArea = 0.0;
        for(int i=0; i<n-2; i++){
            int x1 = p[i][0], y1 = p[i][1];
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    double area=0.5*((p[j][0]-x1)*(p[k][1]-y1)-(p[j][1]-y1)*(p[k][0]-x1));
                    if(area < 0) area = -area;
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}