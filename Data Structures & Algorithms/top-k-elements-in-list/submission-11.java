class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: nums){
            if(map.get(i) != null){
                int cnt = map.get(i);
                map.put(i,++cnt);
            }
            else{
                map.put(i,1);
            }
        }


        for (int i = 0; i < nums.length; i++) {
            ans.add(new ArrayList<>());
        }

        if(map.size() == 1){
            return new int[]{nums[0]};
        }
        for(int i: map.keySet()){
            ans.get(map.get(i)).add(i);
        }
        int res[] = new int[k];
        int idx = 0;
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(i+"->>>");
            for (int j = 0; j < ans.get(i).size(); j++) {
                if(idx == k){
                    break;
                }
                if(ans.get(i).size() != 0){
                    // System.out.print(ans.get(i).get(j)+"\t");
                    res[idx] = ans.get(i).get(j);
                    idx++;
                }
                System.out.print(ans.get(i).get(j)+"\t");
            }
            System.out.println("");
        }

        return res;
    }
}
