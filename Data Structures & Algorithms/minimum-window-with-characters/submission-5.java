class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tmap = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for(char ch: t.toCharArray()){
            tmap.put(ch,tmap.getOrDefault(ch,0) + 1);
        }

        int need = tmap.size(), have = 0;
        int res[] = new int[2];
        int l=0;
        int lenMin = Integer.MAX_VALUE;


        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0) + 1);

            if(tmap.containsKey(c) && window.get(c) == tmap.get(c)){
                have++;
            }

            while(have == need){
                if((r - l + 1) < lenMin){
                    res[0] = l;
                    res[1] = r;
                    lenMin = r - l + 1;
                }

                char left = s.charAt(l);
                window.put(left,window.get(left) - 1);
                if(tmap.containsKey(left) && window.get(left) < tmap.get(left)){
                    have--;
                }
                l++;
            }
        }

        return lenMin != Integer.MAX_VALUE ? s.substring(res[0],res[1] + 1) : "";
    }
}
