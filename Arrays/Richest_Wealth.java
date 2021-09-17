class Solution {
    public int maximumWealth(int[][] accounts) {
      int maxWealth = 0;
            int temp = 0;
        for(int[] ints: accounts){
            temp = 0;
            for(int anInt : ints){
                temp +=anInt;
}
             maxWealth = Math.max(maxWealth,temp);
}
            
            return maxWealth;
     
    }
}