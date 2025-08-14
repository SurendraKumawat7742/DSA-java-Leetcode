class Solution {
    public String largestGoodInteger(String num) {
        String[] arr = {"999","888","777","666","555","444","333","222","111","000"};
        for(int i=0; i<arr.length; i++){
            int j=0;
            while(j < num.length()-2){
                if(arr[i].charAt(0)==num.charAt(j)&&
                    arr[i].charAt(1)==num.charAt(j+1)&&
                    arr[i].charAt(2)==num.charAt(j+2)){
                    return arr[i].toString();
                }else{
                    j++;
                }
            }
        }
        return "";
    }
}