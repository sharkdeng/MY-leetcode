/**
 * struct ListNode {
 *    int val;
 *    struct ListNode *next;
 * };
 */

/**
 *
 * @param pHead ListNode类
 * @return ListNode类
 */
struct ListNode* ReverseList(struct ListNode* pHead ) {
    // write code here
    
    struct ListNode* cur = pHead;
    struct ListNode* pre = NULL;
    struct ListNode* tmp = NULL;
    
    while(cur){
        tmp = cur->next;
        cur->next = pre;
        pre = cur;
        cur = tmp;
    }
    return pre;
}
