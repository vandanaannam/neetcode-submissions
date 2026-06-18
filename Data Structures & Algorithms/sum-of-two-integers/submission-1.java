class Solution {
    public int getSum(int a, int b) {
        int s = b;
        int r =a;
        while( s !=0){
            r = a ^ b;
            s = (a & b) << 1;
            a =r;
            b=s;
        }
        return r;
    }
}
