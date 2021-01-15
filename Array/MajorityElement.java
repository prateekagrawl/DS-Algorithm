 /*

 https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
 
 Time complexity: O(N)
 Space complexity: O(1) */
 
 
 static int majorityElement(int a[], int n)
    {
        // your code here
        int c=1,res=0;
        for(int i=1;i<n;i++){
            if(a[res]==a[i])
              c++;
            else
              c--;
            if(c==0)
            {
                res=i;
                c=1;
            }    
        }
        c=0;
        for(int i=0;i<n;i++){
            if(a[i]==a[res])
              c++;
        }
            if(c<=n/2)
              return -1;
            else
              return a[res];
    }