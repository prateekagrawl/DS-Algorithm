/*
https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

Time complexity : O(n)
Space complexity: O(h) */

// Approach:
// Kind of preorder traversal approach only and for printing the first node of
// each level,we use 2 variables maxLevel and level.

    int maxLevel=0;

    void left(Node root,int level,ArrayList<Integer> al){
        if(root==null)
          return;
        if(maxLevel<level){
          al.add(root.data);
          maxLevel=level;
        }
        left(root.left,level+1,al);
        left(root.right,level+1,al);
    }
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> al=new ArrayList<Integer>();
      left(root,1,al);
      return al;
    }