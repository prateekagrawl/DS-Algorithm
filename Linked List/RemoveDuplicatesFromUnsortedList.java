/* 
https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1

Time complexity: O(N)
Space complexity: O(N) */

public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashSet<Integer> hs=new HashSet<>();
         Node curr=head,prev=null;
         while(curr!=null){
             if(!hs.contains(curr.data)){
                 prev=curr;
                 hs.add(curr.data);
                 curr=curr.next;
             }
             else {
                 prev.next=curr.next; //ignore that repeating node and move forwrd
                 curr=curr.next;
             }
         }
         return head;
    }