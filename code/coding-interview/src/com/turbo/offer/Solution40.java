package com.turbo.offer;

import java.util.Arrays;

/**
 * @author yutao
 * 剑指offer2 - 40 标签：Array
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 **/
public class Solution40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        if(k>=arr.length) return arr;
        int[] nums = new int[k];
        // 这个排序比 冒泡排序效率要高
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }


    public int[] getLeastNumbers1(int[] arr, int k) {
        if(k>=arr.length) return arr;
        Arrays.sort(arr);
        return Arrays.copyOf(arr,k);
    }

    // 数组-冒泡排序
    public int[] getLeastNumbers2(int[] arr, int k) {
        if(k>=arr.length) return arr;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return Arrays.copyOf(arr, k);
    }

    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        ns = sort(ns);
        for (int n : ns) {
            System.out.println(n);
        }
    }
}
