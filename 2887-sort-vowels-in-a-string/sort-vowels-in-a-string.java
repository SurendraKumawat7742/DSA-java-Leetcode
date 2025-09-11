class Solution {
    boolean isVowel(char c){
        return c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||
               c=='e'||c=='i'||    c=='o'||c=='u';
    }
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        for(char c: s.toCharArray()){
            if(isVowel(c)){
                list.add(c);
            }
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        int j =0 ;
        for(int i=0; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                sb.append(list.get(j));
                j++;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}