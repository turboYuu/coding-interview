package com.turbo.topinterviewquestions.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 现有长度为100w+的用户ID（整型数组），找出其中最大的n个用户id，要求尽可能高效
 *  * （可以使用jdk自带的排序方法）
 */
public class solution3 {
    private Set<Integer> result = new HashSet<>();

    public boolean wordBreak(int[] users) {
        //Arrays.sort(users);
        for(int i = 0;i<users.length ;i=i+100){
            int index = 0;
            int[] subUser = new int[100];
            while(index < 100){
                subUser[index ++] = users[i];
            }

        }
        return false;
    }

    public class Sort implements Runnable{
        int[] user;
        public Sort(int[] user) {
            this.user = user;
        }
        @Override
        public void run() {
            Arrays.sort(user);
            result.add(user[0]);
        }
    }




}
