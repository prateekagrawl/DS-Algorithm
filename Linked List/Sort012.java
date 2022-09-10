//https://youtu.be/ogmBt6f9hw8
//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=given-a-linked-list-of-0s-1s-and-2s-sort-it


class Sort012
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        if(head==null || head.next==null)
        {
            return head;
        }
        Node zh = new Node(-1);
        Node oh = new Node(-1);
        Node th = new Node(-1);
        Node zt=zh,ot=oh,tt=th;

        Node curr=head;
        while(curr!=null){
            int val = curr.data;
            if(val==0){
                zt.next = curr;
                zt=zt.next;
            }
            else if(val==1){
                ot.next = curr;
                ot=ot.next;
            }
            else{
                tt.next = curr;
                tt=tt.next;
            }
            curr = curr.next;
        }

        //for linking the three LL's created. What if no LL for 1's is present.
        if(oh.next!=null)
            zt.next = oh.next;
        else
            zt.next = th.next;

        ot.next =th.next;
        tt.next = null;

        head = zh.next;

        return head;


    }

}