class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> n = new ArrayList<>();
        for(int x:nums){
            n.add(x);
        }
        for(int i=0; i<= nums.length; i++){
            if(!n.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
