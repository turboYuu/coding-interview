package com.turbo.offer11;

/**
 * 旋转数组的最小数字
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 *
 * @author yutao
 */
public class Solution {
    /*
        1 暴力方法
     */
    public int minArray(int[] numbers) {
        int a = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]<a){
                return numbers[i];
            }else{
                a = numbers[i];
            }
        }
        return numbers[0];
    }

    /**
     * 2 二分查找
     */
    public int minArray2(int[] numbers){
        int left = 0;
        int right = numbers.length - 1;
        while (left < right){
            int mid = left + (right-left)/2;
            if(numbers[mid] < numbers[right]){
                // 后面是有序的，最小值在前面
                right = mid;
            }else if(numbers[mid] > numbers[right]){
                // 前面是有序的，最小值在后面
                left = mid + 1;
            }else {
                right -= 1;
            }
        }
        return numbers[left];
    }



}
