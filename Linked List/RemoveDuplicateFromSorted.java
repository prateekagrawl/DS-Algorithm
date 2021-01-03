/*https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1

Time complexity: O(n)
Space complexity: O(1)
*/

Node removeDuplicates(Node root)
{
	Node curr=root;
	while(curr!=null && curr.next!=null){
	  if(curr.data == curr.next.data){
	    curr.next= curr.next.next; //delete repeating node
	}
	else
	 curr=curr.next;
    }
        return root;
    }