package com.turbo.topinterviewquestions;

import java.util.HashSet;
import java.util.Set;

/**
 * 链表的交点
 */
public class Solution {

    public class ListNode {
        int val;
         ListNode next;
         ListNode(int x) {
            val = x;
            next = null;
         }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visted = new HashSet<>();
        ListNode temp = headA;
        while (temp != null){
            visted.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null){
            if(visted.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        ListNode pA = headA,pB = headB;
        while(pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
