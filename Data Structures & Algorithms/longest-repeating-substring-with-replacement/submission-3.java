class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0,r = 0;
        int res = 0;
        int maxfreq = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (char c = 'A'; c <= 'Z'; c++) {
           map.put(c, 0);
        }

        while(r < s.length()){
            System.out.println(l+"*******"+r+"*********"+maxfreq);
            char rch = s.charAt(r);
            int rcount = map.get(rch);
            map.put(rch,++rcount);
            
            maxfreq = Math.max(maxfreq,++rcount);

            if((r - l + 1) - maxfreq >= k){
                char lch = s.charAt(l);
                int lcount = map.get(lch);
                map.put(lch,--lcount);
                l++;
            }
            res = Math.max(res,r - l + 1);
            r++;
        }
        return res;
    }
}
