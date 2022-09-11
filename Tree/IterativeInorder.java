 /**
 https://practice.geeksforgeeks.org/problems/inorder-traversal/1

  Time Complexity: O(N).
  Reason: We are traversing N nodes and every node is visited exactly once.

  Space Complexity: O(N)

  Reason: In the worst case (a tree with just left children), the space complexity will be O(N).
  */

 class IterativePreorder{
 public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> as = new LinkedList<>();
         Stack<TreeNode> st = new Stack<>();
         TreeNode curr = root;
         while(true){
         //push the current value to the stack & move the current node to its left child.
            if(curr!=null){
              st.push(curr);
              curr = curr.left;
            }
            else{
            //break loop if stack is empty
              if(st.isEmpty())
                break;
              //if curr node is null, pop it and print it and move to right of that node
              curr = st.pop();
              as.add(curr.val);
              curr=curr.right;
            }
         }
         return as;
 }
 }