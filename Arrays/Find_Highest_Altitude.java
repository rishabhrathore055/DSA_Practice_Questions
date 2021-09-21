class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int current =0;
       for(int i=0;i<gain.length;i++){
        current+=gain[i];
           ans = Math.max(ans,current);
    }
    
    return ans;
}
}
