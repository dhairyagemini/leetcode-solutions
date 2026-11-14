class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        for(String token:tokens){
            if(isoperator(token)){
                int b=stack.pop();
                int a=stack.pop();
                int result=appoperator(token ,a,b);
                stack.push(result);

            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();

    }
    private boolean isoperator(String tokens){
        return tokens.equals("+")||tokens.equals("-")||tokens.equals("*")||tokens.equals("/");
    }
    private int appoperator(String operator ,int a,int b){
        switch(operator){
            case"+":return a+b;
             case"-":return a-b;
              case"*":return a*b;
               case"/":return a/b;
               default:throw new IllegalArgumentException("invalid operator");
        }
    }
}