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