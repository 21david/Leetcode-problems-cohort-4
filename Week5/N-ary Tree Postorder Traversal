/*
https://leetcode.com/problems/n-ary-tree-postorder-traversal/
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        // Accepted
        // 0 ms, faster than 100%
        // 41.9 mb, less than 100%
        
        // post order traversal:
        // traverse all the children from left to right
        // then the root node (parent node)
        
        if(root == null)
            return new ArrayList<>();
        
        for(Node child : root.children)
            postorder(child);
        
        list.add(root.val);
        
        return list;
    }
}
