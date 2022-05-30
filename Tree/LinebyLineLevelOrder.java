
// https://practice.geeksforgeeks.org/problems/level-order-traversal-line-by-line/1

// Time complexity: O(n) since we are visiting every node once
// Space complexity: O(n) since it depends on the queue and in worst case,queue will have all the leaf nodes which is (n/2). 
// where n is the no. of nodes


static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        // ArrayList<Integer> al = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
           int count = q.size(); 
           //we need to write this arraylist here so that elements don't repeat themselves
           ArrayList<Integer> al = new ArrayList<Integer>();
           //loop till that particular level size
           for(int i=0;i<count;i++){
               Node temp = q.poll();
               al.add(temp.data);
               if(temp.left!=null)
                    q.add(temp.left);
               if(temp.right!=null)
                    q.add(temp.right);
           }   
            
            result.add(al);
        }
        return result;
        
        
        
        
        
        
    }