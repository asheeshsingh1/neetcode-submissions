class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        // HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        // for(int i=0;i<s.length();i++){
        //     if(map1.get(s.charAt(i)) != null){
        //         int count = map1.get(s.charAt(i));
        //         map1.put(s.charAt(i),++count);
        //     }
        //     else{
        //         map1.put(s.charAt(i),1);
        //     }
        // }
        // for(int i=0;i<t.length();i++){
        //     if(map2.get(t.charAt(i)) != null){
        //         int count = map2.get(t.charAt(i));
        //         map2.put(t.charAt(i),++count);
        //     }
        //     else{
        //         map2.put(t.charAt(i),1);
        //     }
        // }

        // for (Character i : map2.keySet()) {
        //     // System.out.println("key: " + i + " value: " + map2.get(i));
        //     if(map2.get(i) != map1.get(i)){
        //         return false;
        //     }
        // }

        // for (Character i : map1.keySet()) {
        //     // System.out.println("key: " + i + " value: " + map2.get(i));
        //     if(map1.get(i) != map2.get(i)){
        //         return false;
        //     }
        // }

        // return true;


        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for(int i=0;i<s.length();i++){
            int ascii = s.charAt(i) - 'a';
            int cnt = arr1[ascii];
            arr1[ascii] = ++cnt;
        }

        for(int i=0;i<t.length();i++){
            int ascii = t.charAt(i) - 'a';
            int cnt = arr2[ascii];
            arr2[ascii] = ++cnt;
        }

        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
