package com.turbo.offer;

/**
 * @author yutao
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *
 **/
public class Solution04 {

    /**
     * 在二维有序数组中找到指定的值
     *
     *  从二维数组的右上角开始判断，
     *  比数组中值大，就向下找 x++
     *  比数组中值小，就像左找 y--
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0) return false;


        int x = 0;
        int y = matrix[0].length -1;
        while (x < matrix.length && y >= 0){
            if(matrix[x][y] > target){
                y--;
            }else if(matrix[x][y] < target){
                x++;
            }else{
                return true;
            }
        }
        return false;
    }
}
