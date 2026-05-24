class Solution {
    public boolean isPalindrome(String s) {
        // s = "azAZ09";
        String result = "";
        for(int i=0;i<s.length();i++){
            // System.out.println(s.charAt(i) - '0');
            if((s.charAt(i) - '0' >=49 && s.charAt(i) - '0' <= 74) || (s.charAt(i) - '0' >= 17 && s.charAt(i) - '0' <= 42) ||  (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9)){
                result += s.charAt(i);
            }
        }
        result = result.toLowerCase();
        System.out.println(result);
        // if(result.length() == 1) return false;
        int i=0,j=result.length()-1;
        while(i<=j){
            if(result.charAt(i) != result.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
