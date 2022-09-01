package com.turbo.offer;

/**
 * @author yutao
 * 剑指offer2 - 53-2 标签：Array
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 **/
public class Solution53Plus2 {

    public int missingNumber(int[] nums) {
        int left = 0,right = nums.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if(nums[mid]==mid){
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
}
