package com.anu.game.JZ25;


class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null) return null;

        RandomListNode nHead = new RandomListNode(pHead.label);
        // copy next
        RandomListNode pTmp = pHead.next;
        RandomListNode nTmp = nHead;
        while (pTmp != null) {
            nTmp.next = new RandomListNode(pTmp.label);

            // update
            pTmp = pTmp.next;
            nTmp = nTmp.next;
        }

        // copy random
        pTmp = pHead;
        nTmp = nHead;
        while (pTmp != null) {
            if (pTmp.random == null){
                nTmp.random = null;
            } else{
                int v = pTmp.random.label;
                // find the pointer
                RandomListNode find = nHead;
                while (find != null ){
                    if (find.label == v) break;
                    find = find.next;
                }
                nTmp.random = find;
            }

            // update
            pTmp = pTmp.next;
            nTmp = nTmp.next;
        }

        return nHead;


    }
}