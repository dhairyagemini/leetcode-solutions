class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[] []car=new double[n][2];
        for(int i=0;i<n;i++){
            car[i][0]=position[i];
            car[i][1]=(double)(target-position[i])/speed[i];
        }
            Arrays.sort(car,(a,b)->Double.compare(b[0],a[0]));

            int count=0;
            double prev=0;
            for(double[]cars:car){
                if(cars[1]>prev){
                    count++;
                    prev=cars[1];
                }
            }

        return count;
    }
}