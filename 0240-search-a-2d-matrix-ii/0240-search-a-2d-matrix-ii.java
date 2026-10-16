 class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int [] ans=new int[matrix.length*matrix[0].length];
        int result=0;
        for(int [] arr:matrix){
            for(int num:arr){
                ans[result++]=num;
            }
        }
         Arrays.sort(ans);
        int left=0;
        int right=ans.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(ans[mid]==target)return true;
            else if(ans[mid]<target){
                left=mid+1;
            }
            else right=mid-1;
        }
        return false;
        
    }
}
    
