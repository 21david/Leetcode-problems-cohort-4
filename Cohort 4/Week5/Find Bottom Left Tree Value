/*
https://leetcode.com/problems/find-bottom-left-tree-value/
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
    public int findBottomLeftValue(TreeNode root) {
        ArrayList<Integer> nodes = new ArrayList<>();
        ArrayList<Integer> depths = new ArrayList<>();
        
        fillLists(root, 0, nodes, depths);
        
     //   System.out.println(nodes);
     //   System.out.println(depths);
        
        // find the max depth (and index of it)
        int max = depths.get(0);
        int maxI = 0;
        for(int i = 1; i < depths.size(); i++)
        {
            if(depths.get(i) > max)
            {
                max = depths.get(i);
                maxI = i;
            }
        }
        
        // return the first node it found with the maximum depth (will be the leftmost one)
        return nodes.get(maxI);
        
    }
    
    // fill 'nodes' with the value of all the nodes
    // fill 'depths' with the values of all the depths of each node
    // the indices will match in both arrays (nodes.get(i) has depth depths.get(i)).
    public void fillLists(TreeNode root, int depth, ArrayList<Integer> nodes, ArrayList<Integer> depths)
    {
        if(root == null)
            return;
        
        // parent
        nodes.add(root.val);
        depths.add(depth);
        
        // left
        fillLists(root.left, depth + 1, nodes, depths);
        
        // right
        fillLists(root.right, depth + 1, nodes, depths);
    }
    
    
}
