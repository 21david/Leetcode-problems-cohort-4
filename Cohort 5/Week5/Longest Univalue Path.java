/*
https://leetcode.com/problems/longest-univalue-path/
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // Accepted
    // 7 ms, faster than 10.55%
    // 43.8 mb, less than 10%
    
    int max = 0;
    
    public int longestUnivaluePath(TreeNode root) {
        
        if(root == null)
            return 0;
        
        testEachNode(root);
        
        return max;
    }
    
    // try to find the longest univalue path by starting the search at each node (starting with the root)
    public void testEachNode(TreeNode root)
    {
        if(root == null)
            return;
        
        goDown(root, root.val, 0);
        
        testEachNode(root.left);
        testEachNode(root.right);
        
        
    }
    
    // find the longest possible univalue path to the left and right
    // add them together, if this is a greater max, update the max
    public int goDown(TreeNode root, int val, int ct)
    {
        if(root == null)
        {
            return 0;
        }
        
        if(root.val != val)
        {
            return 0;
            
        }
        
        int left = goDown(root.left, val, ct + 1);
        int right = goDown(root.right, val, ct + 1);
        
        if(left + right > max)
        	max = left + right;
        
        
        
        return 1 + Math.max(left,  right);
    
    }
}
