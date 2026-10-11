class Solution {
    public int sumOfSquares(int[] nums) {
        List<Integer>result=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
               nums[i]= nums[i]*nums[i];
                result.add(nums[i]);

            }
            
            }
             int ans=0;
            for(int sum:result){
                ans+=sum;

            }
                

       return ans;     

        
    }
}