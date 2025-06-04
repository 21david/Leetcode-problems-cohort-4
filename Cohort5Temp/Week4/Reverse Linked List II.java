/*
https://leetcode.com/problems/reverse-linked-list-ii/
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        // Accepted
        // 0 ms, faster than 100%
        // 37.5 mb, less than 11.36%
        
        if(head == null)
            return null;
        else if(n - m <= 0)
            return head;
        else if(m == 1)
            return reverseBetweenIfMEquals1(head, m, n);
            
        
        ListNode start = head;
        
        ListNode rev = head;
        ListNode temp = null;
        
        ListNode orig = head;
        
        int count = 1;
        
        while(count + 1 < m)
        {
            orig = orig.next;
            count++;
        }
        
        System.out.println(orig.val);
        System.out.println(count);
        
        ListNode orig2 = null;
        
        head = orig.next;
        
        while(count < n)
        {
            
            rev = new ListNode(head.val);
            
            if(count == m - 1)
                orig2 = rev;
            
            rev.next = temp;
            temp = rev;
            head = head.next;
            
            count++;
        }
        
        orig.next = rev;
        orig2.next = head;
        
        return start;
    }
    
    // special method for the case where m == 1, since that breaks the first method
    // input is guaranteed to be of size > 1 and m == 1
     public ListNode reverseBetweenIfMEquals1(ListNode head, int m, int n) {
        
        ListNode rev = head;
        ListNode temp = null;
        
        int count = 1;
        
        ListNode orig2 = null;
        
        while(count <= n)
        {
            
            rev = new ListNode(head.val);
            
            if(count == 1)
                orig2 = rev;
            
            rev.next = temp;
            temp = rev;
            head = head.next;
            
            count++;
        }
        
         
        if(head != null)
            orig2.next = head;
        
        return rev;
    }
    
}
