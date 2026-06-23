class Solution {
    public String multiply(String num1, String num2) {
        long x = convertToInt(num1);
        long y = convertToInt(num2);

        return convertToString(x*y);
    }
    public long convertToInt(String num){
        long res =0;
        for(int i=0; i< num.length(); i++){
            int n = num.charAt(i) - '0';
            res = (res * 10)+ n;
        }
        
        return res;
    }
    public String convertToString(long n){
        if(n==0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(n>0){
            long r = n%10;
            n = n/10;
            sb.append(r);
        }
        return sb.reverse().toString();
    }
}
