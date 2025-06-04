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
    
    // Accepted
    // 6 ms, faster than 7.06%
    // 42 mb, less than 8.7%
    
    ArrayList<Integer> values = new ArrayList<>();
    ArrayList<Integer> rows = new ArrayList<>();
    
    public int findBottomLeftValue(TreeNode root) {
        // add all values to 'values' arraylist
        // and add the corresponding row that the value is in in 'rows'
        // then find the max value in 'rows' (to find the deepest row) and return the
        // corresponding value in 'values'. The first max should be the leftmost value of the last row.
        
        fillArrays(root, 0);
        
        System.out.println(values);
        System.out.println(rows);
        
        // find max in rows
        // return that value in values
        
        int max = rows.get(0);
        int leftmostVal = values.get(0);
        
        for(int i = 1; i < rows.size(); i++)
        {
            if(max < rows.get(i))
            {
                max = rows.get(i);
                leftmostVal = values.get(i);
            }
            
        }
        
        return leftmostVal;
        
    }
    
    public void fillArrays(TreeNode root, int depth)
    {
        if(root == null)
            return;
        
        fillArrays(root.left, depth + 1);
        values.add(root.val);
        rows.add(depth);
        fillArrays(root.right, depth + 1);
        
    }
}
