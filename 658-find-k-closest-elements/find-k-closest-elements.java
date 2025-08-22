class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

//1st
        // PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        // for (int integer : arr) {
        //     if (k > 0) {
        //         min_heap.offer(integer);
        //         k--;
        //     } else if (Math.abs(min_heap.peek() - x) > Math.abs(integer - x)) {
        //         min_heap.poll();
        //         min_heap.offer(integer);
        //     }
        // }
        // List<Integer> list = new ArrayList<>();
        // while (!min_heap.isEmpty()) {
        //     list.add(min_heap.poll());
        // }
        // return list;

//2nd
        int left = 0, right = arr.length - 1;

        // shrink the window until size = k
        while (right - left + 1 > k) {
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;  // drop left element
            } else {
                right--; // drop right element
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}