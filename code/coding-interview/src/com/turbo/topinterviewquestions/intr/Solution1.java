package com.turbo.topinterviewquestions.intr;

public class Solution1 {
    /**
     * 所有二位矩阵
     * 从右上角开始遍历
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0,col = matrix[0].length-1;
        while(row <= matrix.length-1 && col>=0){
            if(matrix[row][col] > target){
                col -- ;
            }else if(matrix[row][col] < target){
                row ++;
            }else {
                return true;
            }
        }
        return false;
    }
}
