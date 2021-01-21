 /*
 https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

 Time complexity: O(n)
 Space complexity: O(1)
 */
 public static boolean detectLoop(Node head){
        // Add code here
        Node f=head,s=head; //f is fast pointer and s is the slow pointer
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(f==s)
             return true;
        }
        return false;
    }