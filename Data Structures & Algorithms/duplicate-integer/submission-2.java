class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        // hmap.put(1,10);
        // System.out.println(hmap.get(1));
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
            if(hmap.containsKey(nums[i])){
                return true;
            }
            else{
                hmap.put(nums[i],1);
            }
        }
        return false;
    }
}