class Solution {
    public int[] searchRange(int[] nums, int target) {
      int point=this.findout(nums,target,true);
       
        if(point == -1){return new int[]{-1,-1};}
         int lastpoint=this.findout(nums,target,false);
        return new int[]{point,lastpoint};
    
    }
    public int findout(int[] nums,int target, boolean first){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){

                if(first){
                    if(mid==left||nums[mid-1]!=target){
                    return mid;
                    }
                    right=mid-1;
                }
                else{ if(mid==right||nums[mid+1]!=target){
                    return mid;

                }
                left=mid+1;
                }
                



            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else right=mid-1;
           
           

            
        }
     return -1; 
    }  
    
}