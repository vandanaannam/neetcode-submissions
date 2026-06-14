class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i=0; i<32 ; i++){
            int r = n%2;
            n = n>>1;
            res = res + (r << (31 -i));
            System.out.println(res);
        }
        return res;
    }
}
