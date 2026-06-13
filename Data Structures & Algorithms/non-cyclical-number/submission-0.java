class Solution {
    int r;
    public boolean isHappy(int n) {
        int x = n%10;
        int y = n/10;
        int sum = x*x;
        while(y!=0){
            x=y%10;
            sum = sum + x*x;
            y = y/10;
        }
        System.out.println(sum);
        if(sum==1){
            return true;
        }
        else{
            return false;
        }
    }
}
