class Solution {
    public boolean canJump(int[] nums) {
        int sum =0;
        for(int n: nums){
            sum+=n;
        }
        if(sum==nums.length-1){
            return true;
        }
        return false;
    }
}
