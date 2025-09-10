class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
//1st
        // int m = languages.length;

        // Set<Integer>[] know = new HashSet[m+1];

        // for(int i=1; i<=m; i++){
        //     know[i] = new HashSet<>();
        //     for(int lang : languages[i-1]){
        //         know[i].add(lang);
        //     }
        // }

        // Set<Integer> candidates = new HashSet<>();
        // for(int[] f : friendships){
        //     int u = f[0], v = f[1];
        //     boolean canComm = false;
        //     for(int l : know[u]){
        //         if(know[v].contains(l)){
        //             canComm = true;
        //         }
        //     }
        //     if(!canComm){
        //         candidates.add(u);
        //         candidates.add(v);
        //     }
        // }

        // int best = 0;
        // for(int l = 1; l<=n; l++){
        //     int cnt = 0;
        //     for(int u : candidates){
        //         if(know[u].contains(l)){
        //             cnt++;
        //         }
        //     }
        //     best = Math.max(best, cnt);
        // }
        // return candidates.size()-best;


//2nd
        int[] ln = new int[n+1];
        int max=0;

        Set<Integer> rem = new HashSet<>();

        for(int[] f:friendships){
            if(!hasCommon(languages[f[0]-1],languages[f[1]-1])){
                rem.add(f[0]-1);
                rem.add(f[1]-1);
            }
        }

        for(int i:rem){
            for(int l:languages[i]){
                ln[l]++;
                max=Math.max(ln[l],max);
            }
        }
        return rem.size()-max;
    }
    private boolean hasCommon(int[] arr1,int[] arr2){
        for(int i:arr1){
            for(int j:arr2){
                if(i==j) return true;
            }
        }
        return false;
    }
}