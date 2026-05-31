class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] out = new int[temperatures.length];
        for(int i=0; i<temperatures.length ; i++){
            int m = temperatures[i];
            int c=0;
            int f=0;
            for(int j=i+1; j< temperatures.length ; j++){
                c++;
                if(temperatures[j]>m){
                    f=1;
                    break;
                }
            }
            if(f==1){
                out[i]=c;
            }else{
                out[i]=0;
            }
            
        }
        return out;
    }
}