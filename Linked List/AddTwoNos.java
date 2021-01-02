/*
https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1


Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(Max(N,M))
*/


class Solution{
    static Node reverse(Node root) {
        Node curr=root,prev=null,next=null;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    static Node addLists(Node first, Node second){
        // code here
        // return head of sum list
        first= reverse(first);
        second=reverse(second);
        Node prev=null,res=null,temp=null;
        int s=0,c=0;
        while(first!=null || second!=null){
           s=c+(first!=null?first.data:0)+(second!=null?second.data:0);
           c=(s>=10)?1:0;
           s=s%10;
           //we need to create new nodes since we are storing in new list
           temp=new Node(s);
           if(res==null) //i.e if our head(res) is null
             res=temp;
           else {
               prev.next= temp; //add new node at tail of prev
           }     
           prev=temp;
           if(first!=null)
             first=first.next;
           if(second!=null)
             second=second.next;
       }
       if(c>0)
         prev.next=new Node(c);
       return reverse(res);     
    }
}