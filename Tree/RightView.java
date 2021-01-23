/*

https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1#
Time complexity: O(n)
Space complexity: O(h) */


    int maxLevel=0;

    void right(Node root,int level,ArrayList<Integer> al){
        if(root==null)
          return;
        if(maxLevel<level){
          al.add(root.data);
          maxLevel=level;
        }
        right(root.right,level+1,al);
        right(root.left,level+1,al);
    }
    ArrayList<Integer> rightView(Node node) {
        //add code here.
      ArrayList<Integer> al=new ArrayList<Integer>();
      right(node,1,al);
      return al;
    }