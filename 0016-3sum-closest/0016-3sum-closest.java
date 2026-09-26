    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int sum=nums[0]+nums[1]+nums[2];
            int min=Integer.MAX_VALUE;
            for(int i=0;i<nums.length-2;i++){
                int left=i+1;
                int right=nums.length-1;
                while(left<right){

                int closest=nums[i]+nums[left]+nums[right];
                if(closest==target)return target;
                else if(closest>target)right--;
                else left++;

                int diff=Math.abs(closest-target);
                if(diff<min){
                    sum=closest;
                    min=diff;
                }
            }
            }
            return sum;
        }
    }