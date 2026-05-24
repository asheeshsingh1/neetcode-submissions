class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<Character>();
        List<Character> open = Arrays.asList('(','{','[');
        List<Character> close = Arrays.asList(')','}',']');
        for(int i=0;i<s.length();i++){
            if(open.contains(s.charAt(i))){
                System.out.println("Inside If: "+s.charAt(i));
                stck.push(s.charAt(i));
            }
            else{
                System.out.println("Inside else 0: "+s.charAt(i));
                if(stck.empty()){
                    System.out.println("Inside else 1: "+s.charAt(i));
                    return false;
                }
                else{
                    if(
                        (
                        (stck.peek() == '(' && s.charAt(i) != close.get(0)) ||
                        (stck.peek() == '{' && s.charAt(i) != close.get(1)) ||
                        (stck.peek() == '[' && s.charAt(i) != close.get(2))
                        )
                    ){
                        // System.out.println("Inside else 2.0: "+stck.peek());
                        // System.out.println("Inside else 2.1: "+(stck.peek() == '('));
                        // System.out.println("Inside else 2.2: "+(s.charAt(i) != close.get(0)));

                        // System.out.println("Inside else 2.3: "+(stck.peek() == '{'));
                        // System.out.println("Inside else 2.4: "+(s.charAt(i) != close.get(1)));

                        // System.out.println("Inside else 2.5: "+(stck.peek() == '['));
                        // System.out.println("Inside else 2.6: "+(s.charAt(i) != close.get(2)));
                        
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
