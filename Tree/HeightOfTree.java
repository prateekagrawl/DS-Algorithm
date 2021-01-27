// 1.find height of left subtree
// 2.find height of right subtree
// 3.return max of both of it and add 1

int maxDepth(Node node)  
    { 
        if (node == null) 
            return 0; 
        else 
        { 
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left); 
            int rDepth = maxDepth(node.right); 
   
            /* use the larger one */
            if (lDepth > rDepth) 
                return (lDepth + 1); 
             else 
                return (rDepth + 1); 
        } 
    } 