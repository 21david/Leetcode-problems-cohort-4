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
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        findMax(root);
        
        return max;
    }
    
    // searches through each node, finding the deepest lengths of the left and right children
    // summing them, and looking out for the largest of these sums (the largest one will be the diamater)
    public void findMax(TreeNode root)
    {
        if(root == null)
            return;
        
        // find the longest length starting from the left child and from the right child
        int left = length(root.left, 0);
        int right = length(root.right, 0);
        
        // check if this is bigger than any previous found 'diameters'
        if(left + right > max)
            max = left + right;
        
        findMax(root.left);
        findMax(root.right);
        
    }
    
    // find the longest length from the current node to a leaf node
    public int length(TreeNode root, int depth)
    {
        
        if(root == null)
            return depth;
        
        //left
        int left = length(root.left, depth + 1);
        
        
        //right
        int right = length(root.right, depth + 1);
        
        //System.out.println(left + right);
        
        return Math.max(left, right);
    }
    
}
