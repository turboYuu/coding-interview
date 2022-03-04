package com.turbo.mimi;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 两数之和
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 */
public class Solution1 {

    public int[] toSum(int[] nums,int target){
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int value = nums[i]+nums[j];
                if(value == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    // 1 两数之和
    public int[] toSum1(int[] nums,int target){
        Map<Integer,Integer> hashTab = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashTab.containsKey(target-nums[i])){
                return new int[]{hashTab.get(target-nums[i]),i};
            }else {
                hashTab.put(nums[i],i);
            }
        }
        return new int[]{};
    }




    public int[] toSum2(int[] nums,int target){
        Map<Integer,Integer> hashTab = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashTab.containsKey(target-nums[i])){
                return new int[]{hashTab.get(target-nums[i]),i};
            }else{
                hashTab.put(nums[i],i);
            }
        }
        return new int[0];
    }




























}
