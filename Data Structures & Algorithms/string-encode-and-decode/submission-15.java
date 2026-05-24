class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for(int i=0;i<strs.size();i++){
            // System.out.println(strs.get(i));
            if(i != strs.size() - 1){
                ans += strs.get(i) + ":;";
            }
            else{
                ans += strs.get(i);
            }
            System.out.println(ans);
        }
        return ans;
    }

    public List<String> decode(String str) {
        String[] ans = str.split(":;");
        if(ans.length == 1 && ans[0] == ""){
            return new ArrayList<>();
        }
        return Arrays.asList(ans);
    }
}
