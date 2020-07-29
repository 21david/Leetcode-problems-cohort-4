//  https://leetcode.com/problems/odd-even-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        // 0 ms, faster than 100.00%
        // 39.3 MB, less than 17.15%
        
        if(head == null)
            return null;
        
        ListNode odd, even, evenStart;
        
        odd = head;
        
        even = evenStart = head.next;
        
        while(odd.next != null)
        {
            odd.next = odd.next.next;
            
            if(odd.next == null)
                break;
            
            odd = odd.next;
            
            even.next = odd.next;
            even = even.next;
        }
        
        odd.next = evenStart;
        
        return head;
    }
}
