class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum=0;
        for(int i=0; i<nums.length-1; i++){
            int sum2 =0;
            for(int j = i; j<nums.length; j++){
                sum2 = sum2 + nums[j];
            }
            if(sum2>sum){
                sum = sum2;
            }
        }
        return sum;
    }
}
