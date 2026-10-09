class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        if(s==null||s.length()==0)return 0;
        int count=0;
        for(char c:s.toCharArray()){
           
          map.put(c,map.getOrDefault(c,0)+1);
           }
             boolean hasOdd=false;
           
           for(int b:map.values()){
           count+=(b/2)*2;
           

           if(b%2==1){hasOdd=true;}
           }
           
           if(hasOdd){count+=1;}
        
      return count; 
       
    }
}