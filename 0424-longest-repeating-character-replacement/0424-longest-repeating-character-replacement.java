class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int maxoccur=0;
        int[] occur=new int[26];
        int ans=0;
        for(right=0;right<s.length();right++){
            maxoccur=Math.max(maxoccur,++occur[s.charAt(right)-'A']);
            if(right-left+1-maxoccur>k){
                occur[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}