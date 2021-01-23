/**
https://practice.geeksforgeeks.org/problems/postorder-traversal/1
Time complexity O(n) since every node is visited once and each performs constant time in doing operation.
Space complexity: O(n) since finally stack2 has all elements in it.
 */

// Algorithm:
  //push root node to s1
       //loop while s1 is not empty
         //pop node from s1 and push it to s2
         //push left and right children of popped node to s1
      //loop while s2 is not empty and print contents of s2

ArrayList<Integer> postOrder(Node root){
       ArrayList<Integer> al=new ArrayList<>();
       Stack<Node> s1=new Stack<>();
       Stack<Node> s2=new Stack<>();
       
       s1.push(root);  
       while(!s1.isEmpty()){
           Node temp=s1.pop();
           s2.push(temp);
           if(temp.left!=null)
            s1.push(temp.left);
           if(temp.right!=null)
            s1.push(temp.right);
       }
       while(!s2.isEmpty()){
           Node x=s2.pop();
           al.add(x.data);
       }
       return al;
    }