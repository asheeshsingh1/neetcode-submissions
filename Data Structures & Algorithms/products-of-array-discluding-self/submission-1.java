class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Solution 3
        int len = nums.length;
        int pre[] = new int[len];
        int post[] = new int[len];
        for(int i=0;i<len;i++){
            if(i == 0){
                pre[i] = nums[i] * 1;
            }
            else{
                pre[i] = pre[i - 1]  * nums[i];
            }
        }
        
        for(int i=len - 1;i>=0;i--){
            if(i == len - 1){
                post[i] = nums[i] * 1;
            }
            else{
                post[i] = post[i + 1]  * nums[i];
            }
        }
        
        int ans[] = new int[len];
        for(int i=0;i<len;i++){
            if(i == 0){
                ans[i] = 1 * post[i + 1];
            }
            else if(i == len - 1){
                ans[i] = 1 * pre[i - 1];
            }
            else{
                ans[i] = post[i + 1] * pre[i - 1];
            }
        }
        return ans;
    }
}  
