/*
https://leetcode.com/problems/diameter-of-binary-tree/
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
    
    int maxDepth = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        // Accepted
        // 0 ms, faster than 100%
        // 39.2 mb, less than 18.18%
        
        
        // need to know the max depth downward at any node (its either the left depth or the right depth)
        // and at every parent node, check if the diameter = leftDepth + rightDepth is greater than previous found max
        // so it will always look out foro a bigger diameter, and it will end up checking eveyr possible diameter
        
        depth(root, 0);
        
        return maxDepth;
    }
    
    public int depth(TreeNode root, int depth)
    {
        if(root == null)
            return 0;
        
        int leftDepth = depth(root.left, depth + 1);
        int rightDepth = depth(root.right, depth + 1);
        
        if(leftDepth + rightDepth > maxDepth)
            maxDepth = leftDepth + rightDepth;
        
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
