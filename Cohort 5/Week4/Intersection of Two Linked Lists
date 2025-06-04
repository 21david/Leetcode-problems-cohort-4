/*
https://leetcode.com/problems/intersection-of-two-linked-lists/
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
        // Accepted
        // 7 ms, faster than 26.52%
        // 45 mb, less than 5.71%
        
        HashSet<ListNode> previouslySeen = new HashSet<>();
        
        while(headA != null)
        {
            previouslySeen.add(headA);
            headA = headA.next;
        }
        
        // iterate through 2nd list, checking if the hash set has any of the nodes
        
        while(headB != null)
        {
            if(previouslySeen.contains(headB))
                return headB;
            
            headB = headB.next;
        }
        
        return null;
    }
}
