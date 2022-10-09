/*https://leetcode.com/problems/binary-tree-postorder-traversal/

https://youtu.be/2YBhNLodD8Q

Time Complexity: O(N).
Reason: We are traversing N nodes and every node is visited exactly once.

Space Complexity: O(N+N) */


class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new LinkedList<Integer>();
        Stack<TreeNode> s1= new Stack<>();
        Stack<TreeNode> s2= new Stack<>();

        if(root==null) return ls;

        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode tmp = s1.pop();
            s2.push(tmp);
            if(tmp.left!=null) s1.push(tmp.left);
            if(tmp.right!=null) s1.push(tmp.right);
        }

        while(!s2.isEmpty()){
            TreeNode t = s2.pop();
            ls.add(t.val);
        }
        return ls;
    }
}