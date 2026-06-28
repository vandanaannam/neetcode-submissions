class Solution {
    public int maxSubArray(int[] nums) {
        // if(nums.length==1){
        //     return nums[0];
        // }
        int sum=nums[0];
        int sum2 =0;
        for(int i=0; i<nums.length; i++){
            
            sum2=sum2+nums[i];
                
            if(sum2>sum){
                sum = sum2;
            }
            if(sum2<0){
                sum2=0;
            }
        
        }
        return sum;
    }
}
