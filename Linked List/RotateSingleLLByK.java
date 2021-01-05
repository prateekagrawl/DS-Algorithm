/*
https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1#

Time complexity: O(N)
Space complexity: O(1)

Rotate single LL by k in counter clockwise*/

 public Node rotate(Node head, int k) {
        // add code here
        if(head==null || head.next==null)
          return head;
        Node temp=null,newHead=null,curr=head;
        int count=1;
        while(curr!=null && count<k){
            count++;
            curr=curr.next;
        }
        if(curr==null || curr.next==null)
          return head;
        temp=curr.next;
        newHead=temp; //head of new list
        curr.next=null;
        
        while(temp.next!=null)
          temp=temp.next;
        
        temp.next=head;
        
        return newHead;
    }
