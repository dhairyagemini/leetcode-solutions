class Solution {
    public boolean backspaceCompare(String s, String t) {
    Stack<Character>stack=new Stack<>();


        return build(s).equals(build(t));
    }
    private String build(String str){
         Stack<Character>stack=new Stack<>();

        for(char c:str.toCharArray()){
            if(c=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
                else stack.push(c);
            
        }
        StringBuilder builder =new StringBuilder();
        for(char d:stack){
            builder.append(d);
        }
        return builder.toString();
    }
}