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
    // Accepted
    // 0 ms, faster than 100%
    // 38.7 mb, less than 5.04%
    
    public ListNode reverseList(ListNode head) {
        ListNode rev = head;
        ListNode temp = null;
        
        while(head != null)
        {
            rev = new ListNode(head.val);
            rev.next = temp;
            temp = rev;
            head = head.next;
        }
        
        return rev;
        
    }
}
