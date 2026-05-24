class Solution {
    public int longestConsecutive(int[] nums) {
        
        // Creating set with nums array
        Set<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            set.add(i);
        }
        
        // finding each elements left neighbour
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            // Means starting of the seq
            if(!set.contains(nums[i] - 1)){
                int len = 0;
                while(set.contains(nums[i] + len)){
                    len++;
                }
                ans = Integer.max(len,ans);
            }
        }
        return ans;
    }
}
