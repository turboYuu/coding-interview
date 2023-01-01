package com.turbo.zhixian;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author yutao
 **/
public class Solution {
    /**
     * 1 冒泡排序 时间复杂度O(n^2) 空间复杂度 O(1)
     * @param nums
     * @return
     */
    public static int[] sortArray(int[] nums){
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length-i-1; j++) {
                if(nums[j]<nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }


    /**
     * 2 堆排序  时间复杂度O(nlogn) 空间复杂度 O(1)
     * @param nums
     * @return
     */
    public static int[] sortArray1(int[] nums){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
        }
        int index = 0;
        while (queue.size()>0){
            int num = queue.poll();
            nums[index] = num;
            index += 1;
        }
        return nums;
    }





    public static void main(String[] args) {
        int[] nums = new int[]{34,34,89,1,1,20,12};
        sortArray1(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
