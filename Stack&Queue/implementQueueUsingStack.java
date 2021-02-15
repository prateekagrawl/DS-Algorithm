/*
https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1

Time complexity: O(N) for push and O(1) for pop
Space complexity: O(N) since 2 stacks are used

*/

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    /* The method insert to push element
       into the queue */
    void Push(int x)
    {
	   while(!s1.isEmpty())
	     s2.push(s1.pop());
	   s1.push(x);
	   while(!s2.isEmpty())
	     s1.push(s2.pop());
    }
	
    
    /* The method remove which return the
      element popped out of the queue*/
    int Pop()
    {  int x; 
	   if(s1.isEmpty())
	     x=-1;
	   else {
	     x=s1.pop();  
	   }  
	   return x;
    }
}