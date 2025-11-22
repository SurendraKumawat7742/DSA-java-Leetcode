class Solution {
    public int maxEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events, (a,b) -> (a[0]-b[0]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int i = 0;
        int day = 0;
        int attended = 0;
        while(i < n || !minHeap.isEmpty()){
            if(minHeap.isEmpty()){
                day = events[i][0];
            }
            while(i < n && events[i][0] == day){
                minHeap.offer(events[i][1]);
                i++;
            }
            while(!minHeap.isEmpty() && minHeap.peek() < day){
                minHeap.poll();
            }
            if(!minHeap.isEmpty()){
                minHeap.poll();
                day++;
                attended++;
            }
        }
        return attended;
    }
}