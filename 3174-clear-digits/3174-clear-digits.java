class Solution {
    public String clearDigits(String s) {
        Stack<Character>stack=new Stack<>();
      for(char c:s.toCharArray()){

        if(Character.isDigit(c)){

            if(!stack.isEmpty()){
            stack.pop();
        
        
        }}
        else stack.push(c);
        
        
      }  
      StringBuilder builder=new StringBuilder();
      for(char d: stack){
        builder.append(d);
      }
      return builder.toString(); 
    }
}