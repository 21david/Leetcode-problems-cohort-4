//  https://leetcode.com/problems/reverse-linked-list/

/*
0 ms, faster than 100.00%
40.3 MB, less than 5.01%
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
Approach one:
Convert the linked list into an array or arrayList, then reverse it, then convert
it back into a linked list. 
O(N) time complexity
O(N) space complexity, two additional versions of the original list

Approach two: (the approach I implemented below)
Create a new Linked list add elements to it as you iterate through the original linked list.
O(N) time complexity
O(N) space complexity, one additional version of the original list

Approach three:
use recursion
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        
        ListNode temp1 = head;  // temp1 will iterate through the whole list
        
        ListNode reversed = new ListNode(temp1.val); // reversed will store the final reversed list
        
        while(temp1.next != null) // while there is at least one more node in the list
        {
            temp1 = temp1.next;
            
            ListNode temp2 = new ListNode(temp1.val); 
            temp2.next = reversed;
            reversed = temp2;
        }
        
        return reversed;
    }
}
