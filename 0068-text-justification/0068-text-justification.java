class Solution {
    public List<String> fullJustify(String[] words, int maxwidth) {
        List<String>line=new ArrayList<>();
        int index=0;
        while(index<words.length){
           
            int count=words[index].length();
             int last=index+1;

            while(last<words.length){
                if(count+1+words[last].length()>maxwidth)break;
                    count+=1+words[last].length();
                    last++;
            }
            
            StringBuilder builder=new StringBuilder();
            builder.append(words[index]);
            int diff=last-index-1;
            if(last==words.length||diff==0){
                for(int i=index+1;i<last;i++){
                    builder.append(" ");
                    builder.append(words[i]);
                }
            


            for(int i=builder.length();i<maxwidth;i++){
                builder.append(" ");
            }
            }else{
             int space=(maxwidth-count)/diff;
            int extraspace=(maxwidth-count)%diff;
            for(int i=index+1;i<last;i++){
                for(int s=space;s>0;s--){
                    builder.append(" ");
                    
                }

                if(extraspace>0){
                    builder.append(" ");
                    extraspace--;

                }
                builder.append(" ");
                builder.append(words[i]);
            }
            }
            line.add(builder.toString());
            index=last;
            

        }
        return line;
    }
}