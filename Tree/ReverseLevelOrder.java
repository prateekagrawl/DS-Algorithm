/*
https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1

Time complexity: O(n)
Space complexity: O(n) */

public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        Queue<Node> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        Node curr=node;
        q.add(node);
        while(!q.isEmpty()){
            Node temp= q.poll();
            s.push(temp.data);
            if(temp.right!=null)
              q.add(temp.right);
            if(temp.left!=null)
              q.add(temp.left);
        }
        while(!s.isEmpty())
          al.add(s.pop());
        return al;
    }