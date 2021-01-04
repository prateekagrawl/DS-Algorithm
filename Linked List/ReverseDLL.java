/*
https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
Time complexity: O(N)
Space complexity: O(1) */

public static Node reverseDLL(Node  head)
{
    //Your code here
    Node temp=null,curr=head;
    while(curr!=null){
        temp=curr.prev; //just swap prev and next pointers
        curr.prev=curr.next;
        curr.next=temp;
        curr=curr.prev; //move current pointer forward
    }
    if(temp!=null){
        head=temp.prev; 
    }
    return head;
}