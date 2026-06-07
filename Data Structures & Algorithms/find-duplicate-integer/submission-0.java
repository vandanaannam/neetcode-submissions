class Solution {
    public int findDuplicate(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            if(l.contains(nums[i])){
                return nums[i];
            }
            else{
                l.add(nums[i]);
            }
        }
        return 0;
    }
}
