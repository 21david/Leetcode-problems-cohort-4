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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // find the leaf value sequence for both trees
        ArrayList<Integer> seq1 = new ArrayList<>();
        ArrayList<Integer> seq2 = new ArrayList<>();
        
        leafValueSequence(root1, seq1);
        leafValueSequence(root2, seq2);
        
        // return true if they are equal, false if not
        return seq1.equals(seq2);
    }
    
    // Puts the 'leaf value sequence' of the binary tree 'root' into 'seq'
    public void leafValueSequence(TreeNode root, ArrayList<Integer> seq)
    {
        if(root == null)
            return;
        
        // left
        leafValueSequence(root.left, seq);
        
        // parent. Only add to seq if its a leaf node
        if(root.left == null && root.right == null)
            seq.add(root.val);
        
        // right
        leafValueSequence(root.right, seq);
    }
}
