/*
https://practice.geeksforgeeks.org/problems/preorder-traversal/1
https://leetcode.com/problems/binary-tree-preorder-traversal/


Time Complexity: O(N).

Reason: We are traversing N nodes and every node is visited exactly once.

Space Complexity: O(N)

Reason: In the worst case, (a tree with every node having a single right child and left-subtree,
follow the video attached below to see the illustration), the space complexity can be considered as O(N).
 */

//Stack is used

public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> as = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if(root==null) return as;
        s.push(root);
        while(!s.isEmpty()){
            TreeNode tmp = s.pop();
            as.add(tmp.val);
            if(tmp.right!=null) s.push(tmp.right);
            if(tmp.left!=null) s.push(tmp.left);
        }
        return as;
}