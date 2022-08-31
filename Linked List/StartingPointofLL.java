//https://leetcode.com/problems/linked-list-cycle-ii/
//https://youtu.be/QfbOhn0WZ88

// Time complexity: O(n)
// Space complexity: O(n)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode res = null;
        while(head!=null){
            if(!hs.contains(head))
                hs.add(head);
            else {
                return head;
            }

            head=head.next;
        }
        return null;
    }
}

/*Note: We have added complete Node into the hashset and not only data because there can be a case where
data value is same but next pointer wont be same whatsoever. */


//Optimised Approach:



public class StartingPointofLL {
    public ListNode detectCycle(ListNode head) {
        //base case
        if(head==null || head.next==null) return null;
        ListNode s=head,f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f) break;
        }

        if(s!=f) return null;

        f=head; //change f node to head
        while(f!=s){
            s=s.next;
            f=f.next;
        }
        return s;
    }
}
