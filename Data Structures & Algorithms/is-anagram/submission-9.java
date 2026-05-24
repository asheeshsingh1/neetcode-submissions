class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> mp2 = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(mp1.containsKey(ch)){
                int freq = mp1.get(ch);
                mp1.put(ch,++freq);
            }
            else{
                mp1.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            Character ch = t.charAt(i);
            if(mp2.containsKey(ch)){
                int freq = mp2.get(ch);
                mp2.put(ch,++freq);
            }
            else{
                mp2.put(ch,1);
            }
        }
        for (Character i : mp1.keySet()) {
            if(!mp1.get(i).equals(mp2.get(i))){
                return false;
            }
        }
        for (Character i : mp2.keySet()) {
            if(!mp2.get(i).equals(mp1.get(i))){
                return false;
            }
        }
        return true;
    }
}
