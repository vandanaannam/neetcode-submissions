class Solution {
    public String multiply(String num1, String num2) {
        int x = convertToInt(num1);
        int y = convertToInt(num2);

        return convertToString(x*y);
    }
    public int convertToInt(String num){
        int res =0;
        for(int i=0; i< num.length(); i++){
            int n = num.charAt(i) - '0';
            res = (res * 10)+ n;
        }
        
        return res;
    }
    public String convertToString(int n){
        if(n==0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int r = n%10;
            n = n/10;
            sb.append(r);
        }
        return sb.reverse().toString();
    }
}
