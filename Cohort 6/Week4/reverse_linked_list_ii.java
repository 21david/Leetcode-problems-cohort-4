//  https://leetcode.com/problems/reverse-linked-list-ii/

/*
0 ms, faster than 100.00%
37.4 MB, less than 14.66%
*/

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

/*
An easy approach would be to convert the list to an array or an ArrayList, reverse the
desired section with a simple for loop, and then convert it back into a Linked list,
but this wouldn't be in one pass.

To do it in one pass, we can use four pointers a, b, c, d: a stops at m - 1, b stops 
at m, c stops at n, and d stops at n + 1. Then, we can focus on reversing the nodes 
from m to n, and once we've reversed them, we can put them back by setting a.next to 
the reversed sublist and setting the end of the reversed sublist to the rest of the 
original list.

Time complexity: O(N)
Space complexity: O(N) in the worst case, because when we reverse the 
  nodes from m to n, we create new ListNodes for each. If m == 1 and n == last index,
  then we create as many nodes as there are in the input list.
*/
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        if(m == n) // no changes needed if m == n
            return head;
        
        // If m == 1, code does not work unless we add a dummy node to the front
        boolean dummyInFront = false;
        if(m == 1)
        {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            head = dummy;
            dummyInFront = true;
            m++;
            n++;
        }
        
        ListNode a, b, c, d;
        
        int ct = 1;
        a = head;
        
        // move a to its position
        while(a.next != null && ct < m - 1)
        {
            a = a.next;
            ct++;
        }
        
        
        // move b to its position
        b = a.next;
        ct++;
        
        
        // move c to its position
        c = b;
        while(c.next != null && ct < n)
        {
            c = c.next;
            ct++;
        }
        
        
        // mode d to its position
        d = c.next;
        
        
        // Now we focus on reversing the nodes between b and c
        ListNode temp1 = b;
        ListNode endOfReversed = b; // this comes in handy later
        int mCopy = m; // this comes in handy too
        ListNode reversed = new ListNode(b.val);
        
        while(m < n)
        {
            temp1 = temp1.next;
                
            ListNode temp2 = new ListNode(temp1.val);
            if(m == mCopy)
                endOfReversed = reversed;
            temp2.next = reversed;
            reversed = temp2;
            
            m++;
        }
        
        
        // now 'reversed' has the reversed sublist, so we need to put it back 
        // into the original linked list
        
        a.next = reversed;
        endOfReversed.next = d;
        
        
        // if we added a dummy node to the front, take it off
        if(dummyInFront)
            head = head.next;
        
        // return the final linked list
        return head;
    }
}

/*
Test cases:

[1]
1
1

[3,2]
1
2

[1,2,3,4,5]
2
4

[8, 6, 3, 9, 7, 4, 3]
3
5

edge cases:
(N is the first element, M is anything)
[8, 6, 3, 9, 7, 4, 3]
1
5

(N is anything, M is the last element)
[8, 6, 3, 9, 7, 4, 3]
3
7

(M == N)
[8, 6, 3, 9, 7, 4, 3]
5
5

(M == 1, N == last index)
[8, 6, 3, 9, 7, 4, 3, 2]
1
8
*/
