class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int count:nums){
            map.put(count,map.getOrDefault(count,0)+1);

        }
        Queue<Integer>queue=new PriorityQueue<>(
            (a,b) -> map.get(a)-map.get(b));
        for(int n:map.keySet()){
            queue.add(n);
            if(queue.size()>k){
                queue.poll();
            }

        }
        int[] w =new int[k];
        for(int i=0;i<k;i++){
            w[i]=queue.poll();
        }
        return w;
    }
}