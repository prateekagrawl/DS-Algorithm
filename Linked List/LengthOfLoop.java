/*https://practice.geeksforgeeks.org/problems/find-length-of-loop/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-length-of-loop

Time complexity:O(N)
Space complexity:O(1) */


//Algo:
// 1.Check whether loop exists or not.
// 2.If it does, move slow pointer and traverse it again till fast pointer and keep on increasing count.

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}


public class LengthOfLoop {
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node s = head, f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;

            if(s==f){
                int c = 1;
                s=s.next;
                while(s!=f){
                    c++;
                    s=s.next;
                }
                return c;
            }
        }return 0;

    }
}
