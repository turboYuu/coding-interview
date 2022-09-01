package com.turbo.off21;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yutao
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 **/
public class Solution {

    public int[] exchange(int[] nums) {
        // 偶数
        List<Integer> evens = new ArrayList<>();
        // 奇数
        List<Integer>  odds = new ArrayList<>();
        for (int num : nums) {
            if(num%2==1){
                odds.add(num);
            }else {
                evens.add(num);
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            nums[i] = odds.get(i);
        }
        for (int i = 0; i < evens.size(); i++) {
            nums[odds.size()+i] = evens.get(i);
        }
        return nums;
    }

    /**
     * 2 双指针，在前端找到第一个偶数，在后端找到倒数第一个奇数，进行调换
     * @param nums
     * @return
     */
    public int[] exchange1(int[] nums) {
        int i=0, j=nums.length-1, temp;
        while (i<j){
            while (i<j && (nums[i]%2==1)){ i++;}
            while (i<j && (nums[j]%2==0)){ j--;}
            temp=nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }
}
