/*class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

/*https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1

Time complexity O(n)
Space complexity O(1)
*/

class Sol
{   
     static Node reverse(Node h){
        Node prev=null,curr=h,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public static Node addOne(Node head) 
    { 
        //code here.
        head=reverse(head);
        Node curr=head,temp=null;
        int sum=0,carry=1;
        while(curr!=null){
            sum=curr.data+carry;
//          update carry for next calculation
            carry=(sum>=10)?1:0;
//          update sum if it is greater than 10
            sum=sum%10;
            curr.data=sum;
            // Move curr pointer to next node and store value of prev node in temp
            temp=curr;
            curr=curr.next;
        }
        //add a new node if carry is still left
        if(carry>0){
            temp.next=new Node(carry);
        }
        return reverse(head);
    }
}
