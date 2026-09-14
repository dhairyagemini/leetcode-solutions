class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
       
        Set<Integer>set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
         int longest=1;
        for(int num:set){
            if(set.contains(num-1)){
                continue;

            }
            else{
                 int current=num;
                    int subcount=1;
                while(set.contains(current+1)){
                    current++;
                    subcount++;

                   
                }
                longest =Math.max(longest,subcount);
               
            }

        }
        return longest;

        

    }
}