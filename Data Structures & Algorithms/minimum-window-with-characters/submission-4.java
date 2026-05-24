class Solution {
    public String minWindow(String s, String t) {
        if(t.equals(s)) return t;
        if(t.equals("")) return "";
        HashMap<Character,Integer> fixed = new HashMap<Character,Integer>();
        HashMap<Character,Integer> floating = new HashMap<Character,Integer>();
        for(char ch:t.toCharArray()){
            fixed.put(ch,fixed.getOrDefault(ch,0) + 1);
        }
        // for (Character c: fixed.keySet()) {
        //     System.out.println(c+": " + fixed.get(c));
        // }
        int have = 0,need = fixed.size();
        int l = 0,reslen=Integer.MAX_VALUE;
        int res[] = new int[2];
        for(int r=0;r<s.length();r++){

            // Add current char to floating window
            Character c = s.charAt(r);
            floating.put(c,floating.getOrDefault(c,0) + 1);

            // Check is this addition made a new have++ condition
            if(fixed.containsKey(c) && fixed.get(c) == floating.get(c)){
                have++;
            }

            // Now update result and start shrinking from left so that window is smallest possible
            while(have == need){
                // Updating the Result
                if((r - l + 1) < reslen){
                    res[0] = l;
                    res[1] = r;
                    reslen = r - l + 1;
                }

                // Moving from left l -> l + 1, reduce count from floting window for l index char
                floating.put(s.charAt(l) , floating.get(s.charAt(l)) - 1);

                // Check if it was a need char
                if(fixed.containsKey(s.charAt(l)) && floating.get(s.charAt(l)) < fixed.get(s.charAt(l))){
                    have--;
                }
                l++;
            }
        }
        String ans = s.substring(res[0],res[1] + 1);
        return (reslen != Integer.MAX_VALUE) ? ans : "";
    }
}
