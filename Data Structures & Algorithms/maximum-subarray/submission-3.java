class Solution {
    public int maxSubArray(int[] nums) {
        // if(nums.length==1){
        //     return nums[0];
        // }
        int sum=nums[0];
        for(int i=0; i<nums.length; i++){
            
            for(int j = i; j<nums.length; j++){
                int sum2 =0;
                for(int k=i; k<=j; k++){
                    sum2=sum2+nums[k];
                }
                if(sum2>sum){
                    sum = sum2;
                }
            }
            
        }
        return sum;
    }
}
