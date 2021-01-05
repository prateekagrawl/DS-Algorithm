/*
Given a doubly linked list, rotate the linked list counter-clockwise by k nodes. Here k is a given positive integer and is smaller than the count of nodes in linked list. */

public Node rotateList(Node head,int k){
    if(head==null || head.next==null)
      return head;
    Node node=head;
    k=k % llSize(head);  
    if(k==0)
      return head;
    int count=1;  
    while(node!=null && count<k){
        count++;
        node=node.next;
    }

    Node newHead=node.next;
    newHead.prev=null; //since it is the first node
    node.next=null;

    Node temp=newHead;
    while(temp.next!=null)
      temp=temp.next;
    temp.next=head;
    head.prev=temp;  

    return newHead;
}