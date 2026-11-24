class Solution {
    public String makeGood(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty()&&Math.abs(stack.peek()-c)==32){
                stack.pop();
            }
            else stack.push(c);
        }
        StringBuilder builder =new StringBuilder();
        for(char ch:stack){
            builder.append(ch);
        }
        return builder.toString();
    }
}