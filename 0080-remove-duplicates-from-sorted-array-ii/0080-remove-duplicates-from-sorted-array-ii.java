class Solution {
    public int removeDuplicates(int[] nums) {
       int result=0;
      int i=0;
      for(int num:nums){
        if(i<2||num>nums[i-2]){
             i++;
            nums[result++]=num;
            }
        
        
      }
      return result;
    }

}