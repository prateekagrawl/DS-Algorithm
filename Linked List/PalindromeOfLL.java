//https://leetcode.com/problems/palindrome-linked-list/


/*Algo:
1. Find middle of LL.
2. Reverse 2nd half of the LL.
3. Now start comparing the first half and the 2nd half data of nodes until it traverses till the last element
*/
    class PalindromeOfLL {
        public ListNode middle(ListNode curr){
            ListNode s=curr, f=curr;
            while(f.next!=null && f.next.next!=null){
                s=s.next;
                f=f.next.next;
            }
            return s;
        }

        public ListNode reverse(ListNode curr){
            ListNode prev=null,next=null,temp=curr;
            while(temp!=null){
                next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
            return prev;
        }
        public boolean isPalindrome(ListNode head) {
            ListNode dummy=head, temp = head;
            ListNode m = middle(temp);
            m.next = reverse(m.next);
            ListNode x=m.next;
            while(x!=null){
                if(x.val != dummy.val)
                    return false;
                dummy = dummy.next;
                x = x.next;
            }
            return true;

        }
    }

