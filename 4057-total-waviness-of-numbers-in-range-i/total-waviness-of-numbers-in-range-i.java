class Solution {
//1st
    // public int totalWaviness(int num1, int num2) {
    //     if(num2 < 100){
    //         return 0;
    //     }
    //     if(num1 < 100 && num2 >= 100){
    //         num1 = 100;
    //     }
    //     int cnt = 0;
    //     while(num1 <= num2){
    //         int[] arr = rem(num1);
    //         int n = arr.length;
    //         for(int i=n-2; i>=1; i--){
    //             if((arr[i]>arr[i-1] && arr[i]>arr[i+1])){
    //                 cnt++;
    //             }
    //             if((arr[i]<arr[i-1] && arr[i]<arr[i+1])){
    //                 cnt++;
    //             }
    //         }
    //         num1++;
    //     }
    //     return cnt;
    // }
    // public int[] rem(int n){
    //     ArrayList<Integer> list = new ArrayList<>();
    //     while(n > 0){
    //         int rem = n%10;
    //         list.add(rem);
    //         n /= 10;
    //     }

    //     int[] arr = new int[list.size()];
    //     for(int i=0; i<list.size(); i++){
    //         arr[i] = list.get(i);
    //     }
    //     return arr;
    // }

//2nd
    public int totalWaviness(int num1, int num2) {
        if(num2 < 100){
            return 0;
        }
        if(num1 < 100 && num2 >= 100){
            num1 = 100;
        }
        int cnt = 0;
        for(int i=num1; i<=num2; i++){
            int temp = i;
            int prev = temp%10;
            temp /= 10;
            int curr = temp%10;
            temp /= 10;
            
            while(temp > 0){
                int next = temp%10;
                if((curr>prev && curr>next) || (curr<prev && curr<next)){
                    cnt++;
                }
                prev = curr;
                curr = next;
                temp /= 10;
            }
        }
        return cnt;
    }
}