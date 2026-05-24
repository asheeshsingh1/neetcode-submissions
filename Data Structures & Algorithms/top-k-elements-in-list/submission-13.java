class Solution {
    // 1,2,2,3,3,3,4
   // key:  Value
    // 1:     1
    // 2:     2
    // 3:     3
    // 4:     1
    //  1     2     3    4      5     6    7
    // [1]   [2]   [3]    []    []    []   []
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i:nums){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i) + 1);
            }
            else{
                mp.put(i,1);
            }
        }

        for(int i=0;i<nums.length;i++){
            ans.add(new ArrayList<>());
        }

        for(int i: mp.keySet()){
            int ocr = mp.get(i) - 1;
            ans.get(ocr).add(i);
        }

        int res[] = new int[k];
        int cnt = 0;
        for(int i=ans.size() - 1;i>=0; i--){
            for (int j = 0; j < ans.get(i).size(); j++) {
                if(cnt == k){
                    break;
                }

                if(ans.get(i).size() != 0){
                    res[cnt] = ans.get(i).get(j);
                    cnt++;
                }
            }
        }
        return res;
    }
}
