
class Solution {
    public String multiply(String num1, String num2) {
        java.math.BigInteger x = convertToInt(num1);
        java.math.BigInteger y = convertToInt(num2);

        return convertToString(x.multiply(y));
    }
    public java.math.BigInteger convertToInt(String num){
        java.math.BigInteger res =java.math.BigInteger.ZERO;
        for(int i=0; i< num.length(); i++){
            int n = num.charAt(i) - '0';
            res = (res.multiply(java.math.BigInteger.valueOf(10))).add(java.math.BigInteger.valueOf(n));
        }
        
        return res;
    }
    public String convertToString(java.math.BigInteger n){
        if(n.equals(java.math.BigInteger.ZERO)){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        // n > 0 becomes n.compareTo(java.math.BigInteger.ZERO) > 0
    while (n.compareTo(java.math.BigInteger.ZERO) > 0) {
    
    // n % 10 becomes n.remainder(java.math.BigInteger.valueOf(10))
        java.math.BigInteger r = n.remainder(java.math.BigInteger.valueOf(10));
    
    // n = n / 10 becomes n.divide(java.math.BigInteger.valueOf(10))
        n = n.divide(java.math.BigInteger.valueOf(10));
    
        sb.append(r);
    }
        return sb.reverse().toString();
    }
}
