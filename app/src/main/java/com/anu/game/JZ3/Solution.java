package com.anu.game.JZ3;



import java.util.ArrayList;
import java.util.Stack;

class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }



public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> tmp = new Stack<Integer>();

        while (listNode != null){
            tmp.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> re = new ArrayList<Integer>();
        while (!tmp.isEmpty()){
            re.add(tmp.pop());
        }
        return re;
    }
}