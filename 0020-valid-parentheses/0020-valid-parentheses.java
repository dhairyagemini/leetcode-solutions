class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character>result=new HashMap<>();
        result.put(')', '(');
        result.put('}', '{');
        result.put(']' , '[');
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(!result.containsKey(c)){
                stack.push(c);

            }
        else{
            if(stack.empty()){
                return false;

            }
        
            char top=stack.pop();
            if(top!=result.get(c)){
                return false ;
            }
        }


        }
        return stack.isEmpty();

    }
}