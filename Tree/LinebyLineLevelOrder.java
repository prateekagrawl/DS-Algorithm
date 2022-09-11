//https://leetcode.com/problems/binary-tree-level-order-traversal/
//Time complexity: O(N)
//Space complexity: O(N)

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);

        //base case
        if(root==null)
            return res;

        while(!q.isEmpty()){
            int s= q.size(); //calculate queue size
            List<Integer> ls= new LinkedList<>();

            for(int i=0;i<s;i++){
                TreeNode curr = q.poll();  //remove that node
                ls.add(curr.val);   //add that node to the list
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
            res.add(ls); //add that list to result list
        }
        return res;
    }
}