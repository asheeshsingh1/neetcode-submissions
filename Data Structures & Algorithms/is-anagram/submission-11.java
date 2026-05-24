class Solution {
    public boolean isAnagram(String s, String t) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(char ch: s.toCharArray()){
            int ascii = ch - 'a';
            arr1[ascii]++;
        }
        for(char ch: t.toCharArray()){
            int ascii = ch - 'a';
            arr2[ascii]++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
