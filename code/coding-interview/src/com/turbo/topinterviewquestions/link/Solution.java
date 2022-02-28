package com.turbo.topinterviewquestions.link;

import java.util.List;

// 单链表排序
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    private static ListNode sortList(ListNode head, ListNode tail) {
        if(head == null){
            return head;
        }
        if(head.next == tail){
            head.next = null;
            return head;
        }
        ListNode slow = head,fast = head;
        while (fast != tail){
            slow = slow.next;
            fast = fast.next;
            if(fast != tail){
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode list1 = sortList(head,mid);
        ListNode list2 = sortList(mid,tail);
        return merge(list1,list2);
    }

    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead,temp1 = list1,temp2 = list2;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            }else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if(temp1 != null){
            temp.next = temp1;
        }else if(temp2 != null){
            temp.next = temp2;
        }
        return dummyHead.next;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(0);

       ListNode daymic = new ListNode(4);
       head.next = daymic;

       daymic.next = new ListNode(2);
       daymic = daymic.next;
       daymic.next = new ListNode(1);
       daymic = daymic.next;
       daymic.next = new ListNode(3);

         ListNode listNode = sortList(head.next);
        while (listNode != null){
            System.out.println(listNode.val);
             listNode = listNode.next;
        }
    }
}
