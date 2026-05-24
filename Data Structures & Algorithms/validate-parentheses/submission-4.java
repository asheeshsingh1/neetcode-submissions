class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<Character>();
        List<Character> open = Arrays.asList('(','{','[');
        List<Character> close = Arrays.asList(')','}',']');
        for(int i=0;i<s.length();i++){
            if(open.contains(s.charAt(i))){
                stck.push(s.charAt(i));
            }
            else{
                if(stck.empty()){
                    return false;
                }
                else{
                    if(
                        (stck.peek() == open.get(0) && s.charAt(i) != close.get(0)) ||
                        (stck.peek() == open.get(1) && s.charAt(i) != close.get(1)) ||
                        (stck.peek() == open.get(2) && s.charAt(i) != close.get(2))
                    ){  
                        return false;
                    }
                    else{
                        stck.pop();
                    }
                }
            }
        }
        if(!stck.empty()) return false;
        return true;
    }
}
