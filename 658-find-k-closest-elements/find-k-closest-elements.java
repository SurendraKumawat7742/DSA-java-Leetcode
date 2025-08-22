class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for (int integer : arr) {
            if (k > 0) {
                min_heap.offer(integer);
                k--;
            } else if (Math.abs(min_heap.peek() - x) > Math.abs(integer - x)) {
                min_heap.poll();
                min_heap.offer(integer);
            }
        }
        List<Integer> list = new ArrayList<>();
        while (!min_heap.isEmpty()) {
            list.add(min_heap.poll());
        }
        return list;
    }
}