/*
https://practice.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1

Time complexity: O(n)
Space complexity: O(1)
*/

Node deleteNode(Node head,int x)
    {
	// Your code here	
	    Node temp=head;
	    int i=1;
	    if(x==1) //case1: first node
	    {
	        head=head.next;
	        head.prev=null;
	    }
	    else {
	        while(i<x){
	            temp=temp.next;
	            i++;
	        }
	        if(temp.next!=null) // case2: means it is not the last node
	          {
	              temp.prev.next=temp.next;
	              temp.next.prev=temp.prev;
	          }
	        else  //case3: last node
	          temp.prev.next=null;
	    }
	    return head;
    }
