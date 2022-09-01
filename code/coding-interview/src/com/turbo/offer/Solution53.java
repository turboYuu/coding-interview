package com.turbo.offer;

/**
 * @author yutao
 * 剑指offer2 - 53-1 标签：Array
 * 统计一个数字在排序数组中出现的次数。
 *
 * 大大的问号 ？？？
 **/
public class Solution53 {

//    public int search(int[] nums, int target) {
//
//        int left = 0;
//        int right = nums.length-1;
//
//        while (left < right){
//            int mid = (left+right)/2;
//            if(nums[mid] > target){
//                right = mid-1;
//            } else if (nums[mid] < target){
//                left = mid+1;
//            } else {
//               left = mid;
//               break;
//            }
//        }
//
//    }

    public int search1(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return rightIdx - leftIdx + 1;
        }
        return 0;
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
