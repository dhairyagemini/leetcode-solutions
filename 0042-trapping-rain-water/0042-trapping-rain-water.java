class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1;
        int max=0;
       int leftmax=height[0];
       int rightmax=height[right];
       while(left<right){
        if(height[left]<height[right]){
           leftmax=Math.max(leftmax,height[left]);
           if(leftmax-height[left]>0){
            max=max+leftmax-height[left];
           } 
           left++;
        }
          else{ 
           rightmax=Math.max(rightmax,height[right]);
           if(rightmax-height[right]>0){
            max=max+rightmax-height[right];
           }
          
           right--;

          

        }
       }
       return max;
        
    }
}