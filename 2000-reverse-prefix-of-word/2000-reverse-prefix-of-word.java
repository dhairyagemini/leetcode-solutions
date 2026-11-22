class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>stack=new Stack<>();
        StringBuilder builder=new StringBuilder();
        int ind=-1;
        for(int i=0;i<word.length();i++){
           if (word.charAt(i)==ch){
            ind=i;
            break;
           }
        }
        if(ind==-1)return word;

        for(int i=0;i<=ind;i++){
          stack.push(word.charAt(i));
        }
        while(!stack.isEmpty()){
            builder.append(stack.pop());
        }
        for(int i=ind+1;i<word.length();i++){
            builder.append(word.charAt(i));
        }
        return builder.toString();



    }
}