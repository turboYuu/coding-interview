package com.turbo.offer;

/**
 * @author yutao
 * 剑指offer2 - 17 标签：Array
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 **/
public class Solution17 {

    // 使用 Math.pow 次方运算
    public int[] printNumbers(int n) {
        int max = (int) Math.pow(10,n)-1;
        int[] nums = new int[max];
        for (int i = 1; i <= max; i++) {
            nums[i-1] = i;
        }
        return nums;
    }
}
