/*
https://leetcode.com/problems/odd-even-linked-list/
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
    public ListNode oddEvenList(ListNode head) {
        // Accepted
        // 0 ms, faster than 100%
        // 41.8 mb, less than 5%
        
        if(head == null)
            return null;
        else if(head.next == null)
            return head;
        // else there is at least 2 elements
        
        ListNode oddStart = head;
        
        ListNode evenStart = head.next;
            
        ListNode odd = head, even = head.next;
        
        while(odd != null && even != null && odd.next != null && even.next!= null)
        {
            odd.next = even.next;
            odd = even.next;
            
            even.next = odd.next;
            even = odd.next;
        }
        
        odd.next = evenStart;
        
        return oddStart;
        
    }
}
