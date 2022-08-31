/*
https://leetcode.com/problems/middle-of-the-linked-list/

Time complexity: O(n/2) coz fast moves by 2 nodes at a time.
Space complexity: O(1)
 */


public class MiddleElementOfLL {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head, slow=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
