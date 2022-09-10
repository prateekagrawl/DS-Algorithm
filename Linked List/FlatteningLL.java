//https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=flattening-a-linked-list
//https://youtu.be/ysytSSXpAI0



public class FlatteningLL {
        Node merge(Node a, Node b){
            //similar to merge two sorted LLs
            Node ans = new Node(-1);
            Node temp = ans;
            if(a ==null) return b;
            if(b == null) return a;

            while(a!=null && b!=null){
                if(a.data<b.data){
                    temp.bottom = a;
                    temp = temp.bottom;
                    a=a.bottom;
                }
                else{
                    temp.bottom = b;
                    temp = temp.bottom;
                    b=b.bottom;
                }
            }
            if(a!=null)
                temp.bottom = a; //copy all the nodes available in 'a' to the new LL
            else
                temp.bottom = b;

            return ans.bottom;
        }

        Node flatten(Node root)
        {
            // Your code here
            if(root==null || root.next==null)
                return root;
            root.next = flatten(root.next);
            root = merge(root, root.next);
            return root;

        }
}
