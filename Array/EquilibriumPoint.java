 /*
 https://practice.geeksforgeeks.org/problems/equilibrium-point-1587115620/0/?track=dsa-workshop-1-arrays&batchId=308#
Time complexity: O(N)
Space complexity O(1) */
 
 public static int equilibriumPoint(long a[], int n) {

        // Your code here
        long lsum=0,s=0;
        for(int i=0;i<n;i++){
            s+=a[i];
        }
        for(int i=0;i<n;i++){
            s-=a[i];
            if(s==lsum)
              return (i+1);
            lsum+=a[i];  
        }
        return -1;
    }