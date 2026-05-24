class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for(int i=0;i<=n;i++){
            int k = i;
            int res = 0;
            while(k != 0){
                res += k % 2;
                k = k >> 1;
            }
            ans[i] = res;
        }
        return ans;
    }
}
