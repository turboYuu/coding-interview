package com.turbo.mimi;

import java.util.Stack;

/**
 * 反转链表
 */
public class Solution206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head){
        // 使用栈结构
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode headNode = new ListNode(0);
        ListNode temp = headNode;
        while (!stack.isEmpty()){
            ListNode temp1 = new ListNode(stack.pop());
            temp.next = temp1;
            temp = temp.next;
        }
        return headNode.next;
    }

    // 206 反转链表
    public ListNode reverseList2(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
