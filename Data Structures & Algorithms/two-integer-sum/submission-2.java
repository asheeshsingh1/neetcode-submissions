class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(hmap.containsKey(nums[i])){
                System.out.println("inside if");
                ans[0] = hmap.get(nums[i]);
                ans[1] = i;
                break;
            }
            else{
                hmap.put(diff,i);
                System.out.println("inside else");
            }
        }
        return ans;
    }
}
