class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(String c:operations){
            if(c.equals("D")){
                stack.push(2*stack.peek());
            }
            else if(c.equals("C")){
                stack.pop();
            }
            else if(c.equals("+")){
                int first=stack.pop();
                int second=stack.peek();
              int  sum=first+second;
                stack.push(first);
                stack.push(sum);
            }
            else stack.push(Integer.parseInt(c));
        }
              int total=0;
        while(!stack.isEmpty()){
            total+=stack.pop();

        }
        return total;
    }
}