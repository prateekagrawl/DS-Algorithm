 /*
 https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1

 Time complexity: O(n)
 Space complexity: O(1)*/
 
 public static Node reverse(Node node, int k)
    {
        //Your code here
        Node curr=node,prev=null,next=null;
        int c=0;
        while(c<k && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            c++;
        }
        if(next!=null)
         node.next= reverse(next,k);
        return prev; 
    }