class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
        int l=0;
        int res = 0;
        for(int r=0;r<s.length();r++){
            if(mp.containsKey(s.charAt(r))){
                int freq = mp.get(s.charAt(r));
                mp.put(s.charAt(r),++freq);
            }
            else{
                mp.put(s.charAt(r),1);
            }

            if(r - l + 1 - Collections.max(mp.values()) > k){
                int cnt = mp.get(s.charAt(l));
                mp.put(s.charAt(l),--cnt);
                l++;
            }

            res = Math.max(res,r - l + 1);
        }
        return res;
    }
}
