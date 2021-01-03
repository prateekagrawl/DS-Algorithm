/* https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1

Time complexity: O(n)
Space complexity: O(1)
*/

Node reverseList(Node head)
    {
        // code here
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }