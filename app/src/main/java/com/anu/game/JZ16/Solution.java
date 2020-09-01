package com.anu.game.JZ16;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode re = new ListNode(-1);
        ListNode cur = re;

        // until one list is done
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                ListNode n = new ListNode(list1.val);
                cur.next = n;
                cur = cur.next;
                list1 = list1.next;
            } else {
                ListNode n = new ListNode(list2.val);
                cur.next = n;
                cur = cur.next;
                list2 = list2.next;
            }
        }

        // concate the other list
        if (list1 == null){
            cur.next = list2;
        } else if (list2 == null){
            cur.next = list1;
        }

        return re.next;

    }
}
