class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int find = target - nums[i];
            if(map.containsKey(find)){
                ans[0] = map.get(find);
                ans[1] = i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}
