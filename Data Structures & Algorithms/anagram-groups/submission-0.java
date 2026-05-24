class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<ArrayList<Integer>,ArrayList<String>> ans = new HashMap<ArrayList<Integer>,ArrayList<String>>();
        List<List<String>> result = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            ArrayList<Integer> count = new ArrayList<>(Collections.nCopies(26, 0));
            for(int j=0;j<strs[i].length();j++){
                int ascii = strs[i].charAt(j) - 'a';
                count.set(ascii, count.get(ascii) + 1);
            }
            if(ans.get(count) != null){
                ArrayList<String> putObject = ans.get(count);
                putObject.add(strs[i]);
                ans.put(count,putObject);
            }
            else{
                ArrayList<String> putObject = new ArrayList<String>();
                putObject.add(strs[i]);
                ans.put(count,putObject);
            }
        }
        for(ArrayList<Integer> i: ans.keySet()){
            // System.out.println(ans.get(i));
            result.add(ans.get(i));

        }
        return result;
    }
}
