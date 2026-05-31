class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;
        for(int aste : asteroids){
            if(currMass < aste){
                return false;
            }
            currMass += aste;
        }
        return true;
    }
}