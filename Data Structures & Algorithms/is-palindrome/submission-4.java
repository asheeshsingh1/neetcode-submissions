class Solution {
    public boolean isPalindrome(String s) {
        String sh = "";
        for(char ch: s.toCharArray()){
            if((ch >= 'a' && ch <= 'z') ||
            (ch >= 'A' && ch <= 'Z') || 
            (ch >= '0' && ch <= '9')){
                sh += Character.toLowerCase(ch);
            }
        }
        int i = 0, j = sh.length() - 1;
        System.out.println(j);
        System.out.println(i);
        while(i<j){
            if(sh.charAt(i) != sh.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
