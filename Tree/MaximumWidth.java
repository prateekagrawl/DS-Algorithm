/*
https://practice.geeksforgeeks.org/problems/maximum-width-of-tree/1
Time complexity: O(n)
Space complexity O(width) which can be n as well */

int getMaxWidth(Node root)
    {
        // Your code here
       if(root==null)
        return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int res=0;
        while(!q.isEmpty()){
            int count=q.size();
            if(count>res)
                res=count;
            while(count-->0){
               Node curr=q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return res;
        }