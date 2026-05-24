class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        // Counting the frequency of the items in the array
        for(int i: nums){
            if(map.get(i) != null){
                int cnt = map.get(i);
                map.put(i,++cnt);
            }
            else{
                map.put(i,1);
            }
        }
        // If There is only one item int the list which is repeating and there is no other item
        if(map.size() == 1){
            return new int[]{nums[0]};
        }

        // Making a list of empty list of the size of the nums array
        for (int i = 0; i < nums.length; i++) {
            ans.add(new ArrayList<>());
        }

        // Putting the values from hashmap into the ans ArrayList
        for(int i: map.keySet()){
            ans.get(map.get(i)).add(i);
        }

        // Making the response array while traversing ans from behind to get max freq
        int res[] = new int[k];
        int idx = 0;
        for (int i = ans.size() - 1; i >= 0; i--) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                // Exit from the loop if we get the k == response array size
                if(idx == k){
                    break;
                }
                if(ans.get(i).size() != 0){
                    res[idx] = ans.get(i).get(j);
                    idx++;
                }
            }
        }

        return res;
    }
}
