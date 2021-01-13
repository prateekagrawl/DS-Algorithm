 /* 
 https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1#
 
 Time complexity: O(N)
 Space complexity: O(1) */
 
 int count(Node curr){
        Node h=curr;
        int c=0;
        while(h!=null){
            c++;
            h=h.next;
        }
        return c;
    }
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         int c1=count(head1);
         int c2= count(head2);
         int d;
         if(c1>c2){
             d=c1-c2;
             while(d-->0){
                 head1=head1.next;
             }
         }
         else {
             d=c2-c1;
             while(d-->0){
                 head2=head2.next;
             }
         }
         
         while(head1!=null && head2!=null){
             if(head1==head2) //remember to use this only
               return head1.data;
             head1=head1.next;
             head2=head2.next;
         }
         return -1;
	}