class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        if(nums.length==2){
            ans[0]=0;
            ans[1]=1;
            return ans;
        }
        for(int i=0; i< nums.length; i++){
            int c = target - nums[i];
            int j = binarySearch(c, nums, i);
            System.out.println(j);
            if(i!=j && j!=-1){
                ans[0]=i;
                ans[1]=j;
                return ans;
            }
            
        }
        return ans;
    }
    public int binarySearch(int c, int[] nums, int i){
        int l =i+1;
        int r=nums.length-1;
        
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>c){
                r=mid;
            }else if(nums[mid]<c){
                l=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
        
    }
}
