class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cl = (matrix[0]).length;
        int rl = matrix.length;
        int f=0;
        for(int i=0 ; i<rl ; i++){
            f++;
            if(matrix[i][cl-1] >= target){
                break;
            }
        }
        for(int j =0 ; j < cl ; j++){
            if(f!=0){
               if(matrix[f-1][j] == target){
                return true;
                } 
            }
            
        }
        return false;
    }
}
