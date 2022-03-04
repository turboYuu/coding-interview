package com.turbo.off17;

/**
 *  打印从1到最大的n位数
 * @author yutao
 */
public class Solution {

    public int[] printNumbers(int n){
        int end = (int) (Math.pow(10,n)- 1);
        int[] res = new int[end];
        for(int i=0;i<end;i++){
            res[i] = i+1;
        }
        return res;
    }
}
