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
    
    int max = 0;
    
    public int longestUnivaluePath(TreeNode root) {
        findMax(root);
        return max;
    }
    
    // searches through each node, finding the deepest univalue paths of the left and right children
    // summing them, and looking out for the largest of these sums 
    public void findMax(TreeNode root)
    {
        if(root == null)
            return;
        
        // find the longest univalue path starting from the left child and from the right child
        int left = length(root.left, 0, root.val);
        int right = length(root.right, 0, root.val);
        
        // check if their sum is bigger than any previous found sums
        if(left + right > max)
            max = left + right;
        
        findMax(root.left);
        findMax(root.right);
        
    }
    
    // find the longest length from the current node to a child node, where the values are the same
    public int length(TreeNode root, int depth, int num)
    {
        
        if(root == null)
            return depth;
        
        if(root.val != num)
            return depth;
        
        //left
        int left = length(root.left, depth + 1, num);
        
        
        //right
        int right = length(root.right, depth + 1, num);
        
        //System.out.println(left + right);
        
        return Math.max(left, right);
    }
    
}
