//https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

/*Time complexity: O(N)
Space complexity: O(1) */


//Approach 1:
 class NthNode{
 int getNthFromLast(Node head, int n)
    {
    	// Your code here	
		 int l=0;
		 ListNode temp = head;
		 while(temp!=null){
		 l++;
		 temp = temp.next;
		 }
		 int val = l-n;
		 //base case if we have to delete first node itself
		 if(val == 0)
		 return head.next;

		 ListNode start = head;

		 for(int i=1;i<val;i++)
			start = start.next;

		start.next = start.next.next;

		return head;

		}
 }

// Better approach:
class NthNode1{
	int getNthFromLast(Node head, int n) {
		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode f = dummy, s = dummy;

		for (int i = 1; i <= n; i++)
			f = f.next;

		while (f.next != null) {
			f = f.next;
			s = s.next;
		}

		//delete the node
		s.next = s.next.next;

		return dummy.next;
	}}