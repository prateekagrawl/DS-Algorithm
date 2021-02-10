//https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

/*Time complexity: O(N)
Space complexity: O(1) */

 int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Node ref=head,main=head;
    	while(n-->0){ //move n positions to the front
    	    if(ref==null)
    	      return -1;
    	    ref=ref.next;
    	}
    	while(ref!=null){
    	    ref=ref.next;
    	    main=main.next;
    	}
    	if(main!=null)
    	  return main.data;
    	return -1;  
    }