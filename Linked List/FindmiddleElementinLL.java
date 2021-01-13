/*
https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1

Time complexity: O(N)
Space complexity: O(1) */

int getMiddle(Node head)
    {
         // Your code here.
         if(head==null)
          return -1 ;
         else { 
         Node fptr=head;
         Node sptr=head;
         while(fptr!=null && fptr.next!=null) {
             fptr=fptr.next.next;
             sptr=sptr.next;
         }
         return sptr.data;}
    }