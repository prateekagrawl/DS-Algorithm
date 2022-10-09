//https://leetcode.com/problems/symmetric-tree/

//similar to identicalTrees.java

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return symmetry(root.left, root.right);
    }

    public boolean symmetry(TreeNode left, TreeNode right){
        if(left==null || right==null)
            return left==right;
        return (left.val==right.val) && symmetry(left.left,right.right) && symmetry(left.right,right.left);
    }
}