/*
https://leetcode.com/problems/reverse-linked-list/
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        
        ListNode ans = new ListNode(head.val);
        
        while(head.next!= null)
        {
            head = head.next;
            ListNode copy = new ListNode(head.val);
            copy.next = ans;
            ans = copy;
        }
        
        return ans;
    }
    
    public ListNode reverseRecursively(ListNode reversed, ListNode head)
    {
        reversed.val = head.val;
        return null;
    }
}
