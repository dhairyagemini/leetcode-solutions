class Solution {
    public String minWindow(String s, String t) {
      if(s.length()==0||t.length()==0||s.length()<t.length()){return "";}
      HashMap<Character,Integer>map=new HashMap<>();
      Map<Character,Integer>mapt=new HashMap<>();

      int l=0,r=0;
      int [] ans={-1,0,0};
      int create=0;
      
      for(int i=0;i<t.length();i++){
        map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
      }
      int required=map.size();

      while(r<s.length()){
        char c =s.charAt(r);
        int count=mapt.getOrDefault(c,0);
        mapt.put(c,count+1);
        if(map.containsKey(c)&&map.get(c).intValue()==mapt.get(c).intValue()){
            create++;
        }
while(l<=r&&required==create){
        if(ans[0]==-1||ans[0]>=r-l+1){
            ans[0]=r-l+1;
            ans[1]=l;
            ans[2]=r;
        }
       char leftchar=s.charAt(l);
       mapt.put(leftchar,mapt.get(leftchar)-1);
      if(map.containsKey(leftchar)&&map.get(leftchar).intValue()>mapt.get(leftchar).intValue()){
        create--;
      }
      l++;
      }
      r++;
      }

    if(ans[0]==-1){
        return "";
    }

      
      return s.substring(ans[1],ans[2]+1);

    }
}