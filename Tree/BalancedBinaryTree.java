/*https://leetcode.com/problems/balanced-binary-tree/

Time complexity: O(N)
Space complexity: O(N)*/

Algo:
1. Return height of tree if it is balanced, else return -1.


class Solution {
    public int isBal(TreeNode root){
        if(root==null)
            return 0;
        int lh = isBal(root.left);
        int rh = isBal(root.right);
        if(lh==-1 || rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return (1+Math.max(lh,rh));
    }
    public boolean isBalanced(TreeNode root) {
        boolean res = isBal(root) == -1 ? false: true;
        return res;
    }
}
