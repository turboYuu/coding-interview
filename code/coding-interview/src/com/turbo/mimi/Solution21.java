package com.turbo.mimi;

/**
 * 合并两个有序链表
 */
public class Solution21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 21 合并两个有序链表
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode headNode = new ListNode(0);
        ListNode temp = headNode,temp1 = list1,temp2 = list2;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        } else if(list2 != null){
            temp.next = list2;
        }
        return headNode.next;
    }






    public ListNode mergeTwoLists2(ListNode list1,ListNode list2){
        ListNode headList = new ListNode(0);
        ListNode temp = headList,temp1 = list1,temp2 = list2;
        while (temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                temp.next=temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if(temp1 != null){
            temp.next = temp1;
        } else if (temp2 != null) {
            temp.next = temp2;
        }

        return headList.next;
    }














}
