//https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

/*Time complexity: O(N)
Space complexity: O(1) */

int getNthFromLast(Node head, int n)
    {
    	// currNode is reference pointer, nthNode is main pointer
    Node currNode = head , nthNode = head;
        
        //traverse first n elements
        while(n!=0)
            {
                if(currNode==null)
                    return -1;
                currNode = currNode.next;
                n--;
            }
        //move nthNode (length of LL - n) times
        while(currNode!=null)   
            {
                nthNode = nthNode.next;
                currNode = currNode.next;
            }
        
        if(nthNode!=null)  
            return nthNode.data;
        else
            return -1;
            
    }