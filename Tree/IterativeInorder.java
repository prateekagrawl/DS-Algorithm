 /**
 https://practice.geeksforgeeks.org/problems/inorder-traversal/1
 Time complexity: O(n)
 Space complexity: O(h)
  */
 
 
 ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        Stack<Node> st=new Stack<>();
        Node curr=root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            al.add(curr.data);
            curr=curr.right;
        }
        return al;
    }