class Solution {
    public int maxSubArray(int[] nums) {
        // if(nums.length==1){
        //     return nums[0];
        // }
        int sum=nums[0];
        int sum2 = nums[0];
        for(int i=1; i<nums.length; i++){
            
            
            sum2 = sum2 + nums[i];
            if(nums[i]> sum2){
                sum2 = nums[i];
            }
            if(sum2> sum){
                sum=sum2;
            }
        
        }
        return sum;
    }
}
