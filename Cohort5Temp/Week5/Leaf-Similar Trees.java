/*
https://leetcode.com/problems/leaf-similar-trees/
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
    // 37.7 mb, less than 7.14%
    
    ArrayList<Integer> a1 = new ArrayList<>();
    ArrayList<Integer> a2 = new ArrayList<>();
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return true;
        else if(root1 == null || root2 == null)
            return false;
        
        leafValueSequence(root1, a1);
        leafValueSequence(root2, a2);
        
        return a1.equals(a2);
    }
    
    public void leafValueSequence(TreeNode root, ArrayList<Integer> a)
    {
        
        if(root == null)
            return;
        
        if(root.left == null && root.right == null)
            a.add(root.val);
        else
        {
            if(root.left != null);
                leafValueSequence(root.left, a);

            if(root.right != null)
                leafValueSequence(root.right, a);
        }
    
    }
}
