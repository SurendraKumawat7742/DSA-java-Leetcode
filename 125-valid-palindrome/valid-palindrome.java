class Solution {
    public boolean isPalindrome(String s) {
    //Ist approach
        // s = s.toLowerCase().replaceAll("[^a-z0-9]" , "");
        // int left = 0;
        // int right = s.length()-1;
        // while(left < right){
        //     if(s.charAt(left) != s.charAt(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;


    //2nd
        // int i = 0;
        // int j = s.length()-1;
        // while(i<j) {
        //    char a = s.charAt(i);
        //    char b = s.charAt(j);
        //    if(a>='A' && a<='Z') a=(char)(a+32);
        //    if(b>='A' && b<='Z') b=(char)(b+32);
        //    if(!((a>='a' && a<='z') || (a>='0' && a<= '9'))) {
        //     i++;
        //     continue;
        //    }
        //      if(!((b>='a' && b<='z') || (b>='0' && b<= '9'))) {
        //     j--;
        //     continue;
        //    }
        //    if(a!=b) return false;
        //    i++;
        //    j--;
        // }
        // return true;


    //3rd
        int st = 0;
        int end = s.length()-1;
        while(st <= end){
            if(!Character.isLetterOrDigit(s.charAt(st))){
                st++;
            }else if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }else if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }else{
                st++;
                end--;
            }
        }
        return true;
    }
}