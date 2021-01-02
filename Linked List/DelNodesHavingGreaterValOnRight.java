//https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1#

Time complexity: O(n)
Space complexity: O(1)


/*class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class GfG
{   Node reverse(Node h){
    Node curr=h,next=null,prev=null;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
}
    Node compute(Node head)
    {
        // your code here
        head=reverse(head);
        Node curr=head;
        Node maxnode=head;
        Node temp;
        while(curr!=null && curr.next!=null){
           if(curr.next.data<maxnode.data){
               temp=curr.next;
               curr.next=temp.next;
               temp=null;
           }
           else{
               curr=curr.next;
               maxnode=curr;
           }
        }
        head=reverse(head);
        return head;
    }
    
}