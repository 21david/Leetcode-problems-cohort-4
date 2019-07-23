/*
https://leetcode.com/problems/n-ary-tree-postorder-traversal/
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    ArrayList<Integer> traversal;
    
    public List<Integer> postorder(Node root) {
        traversal = new ArrayList<>();
        
        // if root is null, return empty list
        if(root == null)
            return traversal;
        
        postOrderTraversal(root);
        
        return traversal;
    }
    
    public void postOrderTraversal(Node root)
    {
        
        // iterate through list, left to right
        for(Node child : root.children)
            postOrderTraversal(child);
        
        // print parent
        traversal.add(root.val);
    }
}
