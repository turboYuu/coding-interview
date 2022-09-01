package com.turbo.offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yutao
 * 剑指offer2 - 39 标签：Array
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 **/
public class Solution39 {
    public int majorityElement(int[] nums) {
        if(nums.length == 0) return -1;

        int half = nums.length/2;
        Map<Integer,Integer> kv = new HashMap<>();

        for (int num : nums) {
            if(kv.keySet().contains(num)){
                if(kv.get(num)+1 > half){
                    return num;
                }else {
                    kv.put(num,kv.get(num)+1);
                }
            }else {
                kv.put(num,1);
            }
        }
        return nums[0];

    }

    /**
     * 直接排序，找到中间索引位置的元素
     * @param nums
     * @return
     */
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
