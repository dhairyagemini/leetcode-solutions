class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
       List<Integer>result=new ArrayList<>();
        
        
        for(int a:nums1){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int b:nums2){
           if(map.containsKey(b)&&map.get(b)>0){
            result.add(b);
            map.put(b,map.get(b)-1);

           }
        }
        int[]array=new int[result.size()];
        for(int i=0;i<result.size();i++ ){
            array[i]=result.get(i);
        }

       
return array;
    }
}