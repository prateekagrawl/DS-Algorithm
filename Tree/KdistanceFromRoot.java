/*
https://practice.geeksforgeeks.org/problems/k-distance-from-root/1#
Time complexity:O (n)
Space complexity: O(h) */

void dist(Node root,int k,ArrayList<Integer> al){
        if(root==null || k<0)
            return;
          if(k==0)
           al.add(root.data);
          dist(root.left,k-1,al);
          dist(root.right,k-1,al);
    }
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
          ArrayList<Integer> al=new ArrayList<Integer>();
          dist(root,k,al);
          return al;
           
     }