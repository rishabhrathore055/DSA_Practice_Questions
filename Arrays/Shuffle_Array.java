class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ans = new int[2*n];
        int x = 0, y = n;
        int a = 0;
        while(a<2*n){
            ans[a++] = nums[x++];
            ans[a++] = nums[y++];
     }
        return ans;    
    }
}