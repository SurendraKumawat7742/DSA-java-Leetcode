class Solution {
    public double maxAverageRatio(int[][] classes, int eS) {
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a,b)->
            Double.compare(b[0], a[0]));
        
        for(int[] singleClass : classes){
            int passes = singleClass[0];
            int totalStu = singleClass[1];
            double gain = calGain(passes, totalStu);
            maxHeap.offer(new double[]{
                gain, passes, totalStu
            });
        }
        while(eS-- > 0){
            double[] current = maxHeap.poll();
            double currentGain = current[0];
            int passes = (int)current[1];
            int totalStu = (int)current[2];
            maxHeap.offer(new double[]{
                calGain(passes+1, totalStu+1),
                passes+1,
                totalStu+1
            });
        }
        double maxPassRatio = 0;
        while(!maxHeap.isEmpty()){
            double[] res = maxHeap.poll();
            int passes = (int)res[1];
            int totalStu = (int)res[2];
            maxPassRatio += (double)passes/totalStu;
        }
        return maxPassRatio/classes.length;
    }
    private double calGain(int passes, int totalStu){
        return (
            (double)(passes+1)/(totalStu+1)-
            (double)(passes)/totalStu
        );
    }
}