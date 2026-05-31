class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cl = (matrix[0]).length;
        int rl = matrix.length;
        int i=0;
        // if(cl==0 || rl ==0){
        //     if(matrix[0][0]==target){
        //         return true;
        //     }
        //     return false;
        // }
        for(i=0 ; i<rl ; i++){
            if(matrix[i][cl-1] >= target){
                System.out.println("--");
                break;
            }
        }
        System.out.println(i);
        for(int j =0 ; j < cl ; j++){
            if(matrix[i][j] == target){
                return true;
            }
        }
        return false;
    }
}
