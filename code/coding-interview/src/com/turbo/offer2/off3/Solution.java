package com.turbo.offer2.off3;

import java.util.*;

/**
 * @author yutao
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 *
 *
 **/
public class Solution {
    /**
     * 1 循环全部
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums){
        List<Integer> result = new ArrayList<>();
        Map<Integer,Boolean> kv = new HashMap<>();
        for (int num : nums) {
            if (kv.keySet().contains(num)){
                result.add(num);
            }else {
                kv.put(num,true);
            }
        }
        return result.isEmpty()?0:result.get(0);
    }

    /**
     * 2. 循环部分
     * @param nums
     * @return
     */
    public int findRepeatNumber1(int[] nums){
        Map<Integer,Boolean> kv = new HashMap<>();
        for (int num : nums) {
            if (kv.keySet().contains(num)){
                return num;
            }else {
                kv.put(num,true);
            }
        }
       return -1;
    }


    /**
     * 3 使用 set 循环部分
     * @param nums
     * @return
     */
    public int findRepeatNumber2(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)){
                return num;
            }else {
                numSet.add(num);
            }
        }
        return -1;
    }


}
