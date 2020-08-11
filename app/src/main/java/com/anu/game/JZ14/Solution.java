package com.anu.game.JZ14;



class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class Solution {



    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;


        ListNode re = FindKthToTail(a1, 1);
        System.out.println(re.val);
    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        if (head == null){
            return null;
        }



        // count length
        int count = 0;
        ListNode tmp = head;
        while (tmp != null){
            count += 1;
            tmp = tmp.next;
        }


        if (k > count) {return null;}


        int idx = count-k;
        int i = 0;
        ListNode re = head;
        while (i != idx){
            re = re.next;
            i+=1;
        }
        return re;
    }

}
