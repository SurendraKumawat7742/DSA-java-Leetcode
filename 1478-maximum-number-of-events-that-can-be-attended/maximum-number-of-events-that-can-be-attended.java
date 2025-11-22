class Solution {
    public int maxEvents(int[][] events) {
//1st
        // int n = events.length;
        // Arrays.sort(events, (a,b) -> (a[0]-b[0]));

        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // int i = 0;
        // int day = 0;
        // int attended = 0;
        // while(i < n || !minHeap.isEmpty()){
        //     if(minHeap.isEmpty()){
        //         day = events[i][0];
        //     }
        //     while(i < n && events[i][0] == day){
        //         minHeap.offer(events[i][1]);
        //         i++;
        //     }
        //     while(!minHeap.isEmpty() && minHeap.peek() < day){
        //         minHeap.poll();
        //     }
        //     if(!minHeap.isEmpty()){
        //         minHeap.poll();
        //         day++;
        //         attended++;
        //     }
        // }
        // return attended;


//2nd
        int n = events.length;
        Arrays.sort(events, (a,b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (a - b));
        int result = 0;
        int day = 1;
        int i = 0;

        while (i < n || !pq.isEmpty()) {
            while (i < n && events[i][0] == day) {
                pq.add(events[i][1]);
                i++;
            }

            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            if (!pq.isEmpty()) {
                pq.poll();
                result++;
            }

            day++;
        }
        return result;
    }
}