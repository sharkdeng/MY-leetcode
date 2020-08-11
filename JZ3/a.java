// Source: https://www.nowcoder.com/ta/coding-interviews
// 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。


/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> tmp = new Stack<>();
        while (listNode != null) {
            tmp.push(listNode.val);
            listNode = listNode.next;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        while (!tmp.isEmpty()) {
            result.add(tmp.pop());
        }
        return result;
    }
}
