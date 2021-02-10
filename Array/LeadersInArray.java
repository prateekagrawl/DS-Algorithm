 /**
 https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/0/?track=dsa-workshop-1-arrays&batchId=308
 
 Time complexity: O(n)
 Space complexity: O(n) */
 
 static ArrayList<Integer> leaders(int a[], int n){
        // Your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        int x=a[n-1];
        al.add(x);
        for(int i=n-2;i>=0;i--){
            if(a[i]>=x){
                al.add(a[i]);
                x=a[i];
            }
        }
        Collections.reverse(al);
        return al;
    }
}