class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        String x = sb.toString();
        
        // Use the full path name to bypass the import restriction
        java.math.BigInteger y = new java.math.BigInteger(x);
        java.math.BigInteger z = y.add(java.math.BigInteger.ONE); 
        
        String s = z.toString();
        
        int[] ans = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[i] = Integer.parseInt(s.charAt(i) + "");
        }
        
        return ans;
    }
}