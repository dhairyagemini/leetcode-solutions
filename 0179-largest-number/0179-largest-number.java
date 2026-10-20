class Solution {
    public String largestNumber(int[] nums) {
        String[] string=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            string[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(string, new Comparator<String>() {
            public int compare (String a,String b ){
                String order1=a+b;
                String order2=b+a;
                return order2.compareTo(order1);

            }
    });
    if(string[0].equals("0")){
        return "0";
    }
    StringBuilder sb=new StringBuilder();
    for(String largest:string){
        sb.append(largest);
    }
        

return sb.toString();
        
    }
}