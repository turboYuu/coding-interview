package com.turbo.mimi;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 20 有效的括号
 */
public class Solution20 {
    public boolean isValid(String s){
        int n = s.length();
        if(n%2==1){
            return false;
        }
        Map<Character,Character> pairs = new HashMap<>(){{
            put(')','(');
            put(']','[');
            put('}','{');
        }};
        // 使用队列，有没有匹配，就入队；有和队列头部匹配就出队
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(pairs.containsKey(ch)){
                // 从队列中取出数据和 map 中的value进行匹配
                if(deque.isEmpty() || deque.peek() != pairs.get(ch)){
                    return false;
                }
                deque.pop();
            }else {
                // 放入队列中
                deque.push(ch);
            }
        }
        return deque.isEmpty();
    }


    public boolean isValid1(String s){
        int n = s.length();
        if(n%2 == 1){
            return false;
        }

        Map<Character,Character> pairs = new HashMap<>(){{
           put(')','(');
           put(']','[');
           put('}','{');
        }};

        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Character c = s.charAt(i);
            if(pairs.containsKey(c)){
                if(deque.isEmpty() || deque.peek() != pairs.get(c)){
                    return false;
                }
                deque.pop();
            }else {
                deque.push(c);
            }
        }
        return deque.isEmpty();
    }














}
