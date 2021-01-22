/*
https://practice.geeksforgeeks.org/problems/preorder-traversal/1

Time complexity: O(n)
Space complexity: O(h)  */


static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        Stack<Node> st=new Stack<>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        Node curr=root;
        while(curr!=null || !st.isEmpty()){
            while(curr!=null){
                al.add(curr.data);
                if(curr.right!=null)
                  st.push(curr.right);
                curr=curr.left;  
            }
            if(!st.isEmpty())
              curr=st.pop();
        }
        return al;