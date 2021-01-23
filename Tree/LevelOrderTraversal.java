/*
https://practice.geeksforgeeks.org/problems/level-order-traversal/1#
Time complexity: O(n) since we are visiting every node once
Space complexity: O(n) since it depends on the queue and in worst case,queue will have all the leaf nodes which is (n/2). 
where n is the no. of nodes*/

static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList <Integer> al=new ArrayList <Integer>();
        Queue<Node> q=new LinkedList<>();
        Node curr=node;
        q.add(node);
        while(!q.isEmpty()){
            Node temp=q.poll();
            al.add(temp.data);
            if(temp.left!=null)
             q.add(temp.left);
            if(temp.right!=null)
              q.add(temp.right);
        }
        return al;
    }