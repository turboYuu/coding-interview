package com.turbo.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yutao
 *
 * 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 *
 *
 **/
public class Solution61 {

    /**
     * 1. 首先去掉 大小王
     * 2. 剩余的不能重复
     * 3. 最大值减去最小值 要 小于5
     * @param nums
     * @return
     */
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int min =  14,max = 0;
        for (int num : nums) {
            if(num == 0) continue;
            min = Math.min(min,num);
            max = Math.max(max,num);
            if(repeat.contains(num)){
                return false;
            }
            repeat.add(num);
        }
        return max-min<5;
    }
}
