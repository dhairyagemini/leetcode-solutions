class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0||s.length()<t.length())return "";
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);

        }
        int required=map.size();
        int r=0,l=0;
        int create=0;
        int ans[]={-1,0,0};
        Map<Character,Integer>maap=new HashMap<>();
        while(r<s.length()){
            char c=s.charAt(r);
            int count=maap.getOrDefault(c,0);
            maap.put(c,count+1);
            if(map.containsKey(c)&&maap.get(c).intValue()==map.get(c).intValue()){
                create++;
            }
            while(l<=r&&required==create){
                c=s.charAt(l);
                if(ans[0]==-1||ans[0]>r-l+1){
                    ans[0]=r-l+1;
                    ans[1]=l;
                    ans[2]=r;
                }
                maap.put(c,maap.get(c)-1);
                 if(map.containsKey(c)&&maap.get(c).intValue()<map.get(c).intValue()){
                create--;
                
            }
            l++;
        }
        r++;
        }
        
     return ans[0]==-1?"":s.substring(ans[1],ans[2]+1);


    }
}