//  https://leetcode.com/problems/merge-k-sorted-lists/

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
    public ListNode mergeKLists(ListNode[] lists) {
        // 5 ms, faster than 60.36%
        // 41 MB, less than 63.82%
        
        /*
        1. Put all the lists into a PriorityQueue<Integer>.
        2. Use the PriorityQueue to build a linked list that contains
        all the elements in sorted order, and return it.
        */
        
        if(lists == null || lists.length == 0)
            return null;
        
        // 1. Put all the elements in the lists into one big PriorityQueue
        // O(NlogN) time complexity, O(N) space complexity
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode list : lists)
        {
            ListNode head = list;
            
            while(head != null)
            {
                pq.add(head.val);
                head = head.next;
            }
        }
        
        if(pq.size() == 0)
            return null;
        
        // 2. Use the PriorityQueue to build a big linked list, O(NlogN) time complexity
        ListNode head = new ListNode(pq.poll());
        ListNode it = head;
        while(!pq.isEmpty())
        {
            it.next = new ListNode(pq.poll());
            it = it.next;
        }
        
        // return the linked list
        return head;
    }
}
