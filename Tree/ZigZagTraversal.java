
https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=level-order-traversal-in-spiral-form


//Time complexity: O(N)
//Space complexity: O(N)


class Spiral
{
    //Function to return a list containing the level order
    //traversal in spiral form.
    ArrayList<Integer> findSpiral(Node root)
    {
        // Your code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        boolean rightToLeft = true;
        if (root==null) return al;
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> res= new ArrayList<Integer>();
            int s = q.size();
            for(int i=0;i<s;i++){
                Node tmp = q.poll();
                res.add(tmp.data);
                if(tmp.left!=null)
                    q.add(tmp.left);
                if(tmp.right!=null)
                    q.add(tmp.right);

            }
            //we check via flag, if its true, reverse the list else do nothing
            if(rightToLeft)
                Collections.reverse(res);

            rightToLeft = !rightToLeft;
            for(int i=0;i<res.size();i++){
                al.add(res.get(i));
            }

        }
        return al;
    }
}