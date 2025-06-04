//  https://leetcode.com/problems/intersection-of-two-linked-lists/

/*
7 ms, faster than 28.75%
43.3 MB, less than 12.94%
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> nodesInA = new HashSet<>();
        
        ListNode a = headA;
        
        while(a != null)
        {
            nodesInA.add(a);
            a = a.next;
        }
        
        ListNode b = headB;
        
        while(b != null)
        {
            if(nodesInA.contains(b))
                return b;
            
            b = b.next;
        }
        
        
        return null;
    }
}
