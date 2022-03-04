package com.turbo.mimi;

import java.util.Scanner;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 动态规划
 *
 * 爬到第n级台阶 = 从爬第 n-1 台阶爬1级 或 从爬第 n-2 台阶爬 2 级
 * Fn = Fn-1 + Fn-2
 */
public class Solution70 {


    // 方法1 递归
    public int climbStairs(int n){
        if(n==1){
            return 1;
        }else if(n == 2){
            return 2;
        }else {
            return climbStairs(n-1)+climbStairs(n-2);
        }
    }

    // 斐波那契数列
    public int climbStairs1(int n){
        if(n==1){
            return 1;
        }
        int first = 1,second =2;
        for (int i = 3; i <= n ; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    // 70 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
    // 斐波那契数列
    public int climbStairs2(int n){
        int p=0,q=0,r=1;
        for (int i = 1; i <=n; i++) {
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
