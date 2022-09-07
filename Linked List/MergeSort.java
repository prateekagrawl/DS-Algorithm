//https://leetcode.com/problems/sort-list/
//https://youtu.be/rM5EEA_rbNY

//Time complexity: O(nlogn)
//Space complexity: O(logn)

class MergeSort {
    public ListNode merge(ListNode l, ListNode r){
        ListNode ans = new ListNode();
        ListNode temp = ans;

        if(l==null) return r;
        if(r==null) return l;

        while(l!=null && r!=null){
            if(l.val < r.val){
                temp.next = l;
                temp = l;
                l= l.next;
            }
            else{
                temp.next = r;
                temp = r;
                r= r.next;
            }
        }
        while(l!=null){
            temp.next = l;
            temp = l;
            l= l.next;
        }
        while(r!=null){
            temp.next = r;
            temp = r;
            r= r.next;
        }
        return ans.next;
    }

    public ListNode middle(ListNode h){
        ListNode s= h, f = h;
        while(f.next!=null && f.next.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;

        //find the middle
        ListNode mid = middle(head);

        //break LL into two halves
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        //sort the 2 linkedlists
        left = sortList(left);
        right = sortList(right);

        //merge LLs
        ListNode res = merge(left,right);

        return res;

    }
}
