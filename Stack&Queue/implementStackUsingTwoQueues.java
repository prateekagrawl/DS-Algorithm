/**
https://practice.geeksforgeeks.org/problems/stack-using-two-queues/1
Time complexity: O(1) for pop operation and O(N) for push operation */    
    
    
    
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    // Your code here
	    int x;
	    if(!q1.isEmpty())
	      x=q1.poll();
	    else 
	      x=-1;
	    return x;  
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    // Your code here
	    while(!q1.isEmpty()){
	        q2.add(q1.poll());
	    }
	    q1.add(a);
	    while(!q2.isEmpty()){
	        q1.add(q2.poll());
	    }
    }
}