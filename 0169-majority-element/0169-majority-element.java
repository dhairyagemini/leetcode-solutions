class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int b:nums){
            map.put(b,map.getOrDefault(b,0)+1);
         }
         int max=-1,freq=0;
         for(int key:map.keySet()){
            if(map.get(key)>freq){
                freq=map.get(key);
                max=key;
            }
         }

         
         
        return max;
    }
}