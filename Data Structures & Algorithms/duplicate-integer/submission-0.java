class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> setOccur = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            // System.out.println(nums[i]);
            if(setOccur.contains(nums[i])){
                return true;
            }
            setOccur.add(nums[i]);
        }
        return false;
    }
}