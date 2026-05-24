class Solution {

    public String encode(List<String> strs) {
        String s = "";
        for(int i=0;i<strs.size();i++){
            if(i == strs.size() - 1){
                s += strs.get(i);
            }
            else{
                s += strs.get(i) + ":;";
            }
        }
        return s;
    }

    public List<String> decode(String str) {
        String s[] = str.split("\\:;");
        if(s.length == 1 && s[0] == "") {
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>(Arrays.asList(s));
        return ans;
    }
}
