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
    
    ArrayList<Integer> leftLeaves;
    
    public int sumOfLeftLeaves(TreeNode root) {
        leftLeaves = new ArrayList<Integer>();
        
        // add all left leaves to an arraylist
        helper(root, false);
        
        // find sum
        int sum = 0;
        for(int i : leftLeaves)
            sum += i;
        
        // return sum
        return sum;
    }
    
    // adds all left leaves to the arraylist 'leftLeaves'
    public void helper(TreeNode root, boolean isLeft)
    {
        if(root == null)
            return;
        
        // left
        helper(root.left, true);
        
        // parent
        if(root.left == null && root.right == null && isLeft)
            leftLeaves.add(root.val);
        
        // right
        helper(root.right, false);
    }
}
