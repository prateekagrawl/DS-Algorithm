/*
https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1#

Time complexity: O(N)
Space complexity: O(1) */

public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node f=head,s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f)
              break;
        }
        if(s==f){
            if(f==head){
                while(s.next!=f){
                    s=s.next;
                }
                s.next=null;
            }
            else{
                s=head;
                while(s.next!=f.next){
                    s=s.next;
                    f=f.next;
                }
                f.next=null;
            }
        }
    }