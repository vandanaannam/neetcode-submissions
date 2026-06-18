class Solution {
    public int reverse(int x) {
        Boolean isb = false;
        if(x<0){
            isb = true;
        }
        String str = new StringBuilder(String.valueOf(Math.abs((long)x))).reverse().toString();
        long n = Long.parseLong(str);
        if(isb){
            n = -n;
        }
        if(n< Integer.MIN_VALUE || n > Integer.MAX_VALUE){
            return 0;
        }
        return (int) n;
    }
}
