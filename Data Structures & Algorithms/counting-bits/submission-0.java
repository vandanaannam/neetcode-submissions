class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] =0;
        for(int i=1; i<=4 ; i++){
            
            int ny =i;
            StringBuilder s = new StringBuilder();
            while( ny >0){
                int r = ny%2;
                s.insert(0,r);
                ny = ny/2;
            }
            int num = Integer.parseInt(s.toString(),2);
        
            int c = 0;
            while(num!=0){
                int y = num % 2;
                num = num >> 1;
                if(y==1){
                    c++;
                }
            }
            // System.out.println(c);
            res[i] = c;
        }
        return res;
    }
    
}
