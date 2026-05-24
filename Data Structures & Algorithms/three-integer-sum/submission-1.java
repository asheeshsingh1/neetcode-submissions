class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<len;i++){
            System.out.println(nums[i]);
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int l = i + 1;
            int r = len - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum < 0){
                    l++;
                }
                else if(sum > 0){
                    r--;
                }
                else{
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    while(nums[l] == nums[l - 1] && l < r){
                        l++;
                    }
                }
            }
        }
        return ans;
    }
}
