/*
https://leetcode.com/problems/sum-of-left-leaves/
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
    // 0 ms, faster than 100%
    // 37.7 mb, less than 84.78%
    
    int sum = 0;
    boolean isLeft = false;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || root.left == null && root.right == null)
            return 0;
        else
        {
            sumOfLeftLeavesHelp(root);
            return sum;
        }
    }
    
    public void sumOfLeftLeavesHelp(TreeNode root) {
        if(root == null)
            return;
        
        if(root.left == null && root.right == null)
           sum += isLeft? root.val : 0;
        
        isLeft = true;
        sumOfLeftLeavesHelp(root.left);
        isLeft = false;
        
        sumOfLeftLeavesHelp(root.right);
    }
}
