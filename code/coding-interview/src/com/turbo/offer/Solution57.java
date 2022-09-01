package com.turbo.offer;

import java.util.Arrays;
import java.util.List;

/**
 * @author yutao
 *
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，
 * 使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 **/
public class Solution57 {

    // 超时
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    res[0] = nums[i];
                    res[1] = nums[j];
                    return res;
                }
            }
        }
        return res;
    }

    // 因为是一个递增排序的数组，就使用双指针
    public int[] twoSum1(int[] nums, int target) {
       int i=0,l=nums.length-1;
       while (i<l){
           int s = nums[i]+nums[l];
           if(s>target) l--;
           else if(s<target) i++;
           else return new int[]{nums[i],nums[l]};
       }
       return new int[0];
    }
}
