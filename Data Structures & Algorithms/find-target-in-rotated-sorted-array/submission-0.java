class Solution {
    // 1
    // 6 1 2 3 4 5
    public int search(int[] nums, int target) {
        int l =0,r=nums.length - 1;
        while(l<=r){
            int m = (l + r)/2;
            if(nums[m] == target) return m;

            // Check if we are in left sorted array or right
            if(nums[l] <= nums[m]){
                if(target > nums[m] || target < nums[l]){
                    l = m + 1;
                }
                else{
                    r = m - 1;
                }
            }
            else{
                if(target < nums[m] || target > nums[r]){
                    r = m - 1;
                }
                else{
                    l = m + 1;
                }
            }
        }
        return -1;
    }
}
