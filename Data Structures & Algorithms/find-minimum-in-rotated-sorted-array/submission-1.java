class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int x=nums[r];
        while(l<=r){
            int m = (l+r)/2;
            if(nums[m]<x){
                x=nums[m];
                r=m;   
            }else{
                l= m+1;
            }

        }
        return nums[r];
    }
}
