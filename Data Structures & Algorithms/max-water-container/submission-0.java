class Solution {
    public int maxArea(int[] heights) {
        int max =0;
        for(int i=0; i< heights.length-1 ; i++){
            for(int j=i+1; j< heights.length ; j++){
                int x = j-i;
                int y = (heights[i]<heights[j])? heights[i]: heights[j];
                if(max< x*y){
                    max = x*y;
                }
            }
        }
        return max;
    }
}
