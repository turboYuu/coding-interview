package com.turbo.off29;

/**
 * @author yutao
 * 剑指offer2 - 29 标签：Array
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 **/
public class Solution {

    /**
     * 找出上下左右四个边界的索引值。
     * 1. 从左到右遍历，然后 上边界索引值+1，并和下边界索引值进行比较
     * 2. 从上到下遍历，然后 右边界索引值-1，并和左边界索引值进行比较
     * 3. 从右到左遍历，然后 下边界索引值-1，并和上边界索引值进行比较
     * 4. 从下到上遍历，然后 左边界索引值+1，并和右边界索引值进行比较
     * @param matrix
     * @return
     */
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        int left = 0;                  // 左边界索引
        int right = matrix[0].length-1; // 右边界索引
        int top = 0;                  // 上边界索引
        int bottom = matrix.length-1;    // 下边界索引
        int x = 0;
        int[] nums = new int[(right+1)*(bottom+1)];
        while(true){
            // 左到右
            for(int i=left;i<=right;i++) nums[x++] = matrix[top][i];
            if(++top>bottom) break;

            // 从上到下
            for (int i=top;i<=bottom;i++) nums[x++] = matrix[i][right];
            if(--right<left) break;

            // 从右到左
            for(int i=right;i>=left;i--) nums[x++] = matrix[bottom][i];
            if(--bottom<top) break;

            // 从下到上
            for (int i=bottom;i>=top;i--) nums[x++] = matrix[i][left];
            if(++left>right) break;
        }

        return nums;
    }
}
