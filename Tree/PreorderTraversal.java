/*https://leetcode.com/problems/binary-tree-preorder-traversal/

Time complexity: O(N) since it will traverse each node once.
Space complexity: O(h) where h is the height of the binary tree. Space is needed for the recursion stack.
    In the worst case (skewed tree), space complexity can be O(N).

*/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> as = new ArrayList<>();
        preOrder(root,as);
        return as;
    }
    public void preOrder(TreeNode root, List<Integer> res){
        if(root==null)
            return;

        res.add(root.val);
        preOrder(root.left,res);
        preOrder(root.right,res);
    }
}