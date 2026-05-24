class Solution {
    // len = 4 - 1 = 3
    // 0   1    2    3
    //     i
    // 1   2    4    6
    // 1   2    8    24
    //48   48   24   6 
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int pre[] = new int[len];
        int post[] = new int[len];
        for(int i=0;i<len;i++){
            if(i == 0){
                pre[i] = nums[i];
            }
            else{
                pre[i] = pre[i - 1] * nums[i];
            }
        }
        for(int i = len - 1;i >= 0;i--){
            if(i == len - 1){
                post[i] = nums[i];
            }
            else{
                post[i] = post[i+1] * nums[i];
            }
        }
        int res[] = new int[len];
        for(int i=0;i<len;i++){
            if(i == 0){
                res[i] = post[i + 1];
            }
            else if(i == len - 1){
                res[i] = pre[i - 1];
            }
            else{
                res[i] = pre[i - 1] * post[i + 1];
            }
            // System.out.print(pre[i] + " ");
        }
        return res;
    }
}  
