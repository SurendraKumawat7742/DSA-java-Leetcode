class Solution {
    public boolean isPalindrome(int x) {
//1st
        // String s = String.valueOf(x);
        // int left = 0, right = s.length()-1;
        // while(left <= right){
        //     if(s.charAt(left) != s.charAt(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;


//2nd
        if(x < 0) return false;

        int ori = x;
        int rev = 0;

        while(x != 0)
        {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return ori == rev;
    }
}