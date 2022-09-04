/* https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1

Time complexity: O(n)
Space complexity: O(1)
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

//Approach2: recursive (based on gfg blog https://geeksforgeeks.org/reverse-a-linked-list/)
class reverseRecursive{
    public ListNode reverseList(ListNode head) {

        // Recursive approach
        if(head==null || head.next==null) return head;
        ListNode rest = reverseList(head.next);

        // change the pointer to the first node
        head.next.next = head;
        head.next = null;
        return rest;
        }
}