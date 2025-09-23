class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int max = Math.max(s1.length, s2.length);
        int min = Math.min(s1.length, s2.length);
        for(int i=0; i<min; i++){
            int v1 = Integer.parseInt(s1[i]);
            int v2 = Integer.parseInt(s2[i]);
            if(v1 < v2){
                return -1;
            }else if(v1 > v2){
                return 1;
            }
        }
        if(s1.length < s2.length){
            for(int i=min; i<max; i++){
                int v1 = 0;
                int v2 = Integer.parseInt(s2[i]);
                if(v1 < v2){
                    return -1;
                }
            }
        }else{
            for(int i=min; i<max; i++){
                int v2 = 0;
                int v1 = Integer.parseInt(s1[i]);
                if(v1 > v2){
                    return 1;
                }
            }
        }
        return 0;
    }
}