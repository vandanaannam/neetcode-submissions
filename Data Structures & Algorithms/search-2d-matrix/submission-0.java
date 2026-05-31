class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cl = (matrix[0]).length-1;
        int rl = matrix.length-1;
        int i=0;
        for(i=0 ; i<=rl ; i++){
            if(matrix[i][cl] > target){
                break;
            }
        }
        for(int j =0 ; j <= cl ; j++){
            if(matrix[i][j] == target){
                return true;
            }
        }
        return false;
    }
}
