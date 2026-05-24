class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longest = 0;
        for(Integer i: nums){
            if(!set.contains(i-1)){
                int len = 0;
                while(set.contains(i + len)){
                    len++;
                }
                longest = Math.max(longest,len);
            }
        }
        return longest;
    }
}
