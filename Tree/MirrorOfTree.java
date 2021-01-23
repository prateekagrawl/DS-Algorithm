 /*
 https://practice.geeksforgeeks.org/problems/mirror-tree/1#
Time complexity: O(n)
Space complexity: O(h)

 Algorithm:
 1.Recursively call for left subtree
 2.Recursively call for right subtree
 3. Swap left and right pointers. */
 
 void mirror(Node node)
    {
	// Your code here
    	Node temp;
    	if(node==null)
    	 return ;
    	
    	else{
    	    mirror(node.left);
    	    mirror(node.right);
    	    
    	    temp=node.left;
    	    node.left=node.right;
    	    node.right=temp;
      	}
    }