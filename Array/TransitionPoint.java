/*https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1/?track=dsa-workshop-1-arrays&batchId=308

Time complexity: O(log n)
Space: O(1) */

    int transitionPoint(int a[], int n) {
        // code here
        int l=0,r=n-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==1 && (m==0 || a[m-1]==0))
              return m;
            else if(a[m]==0)
              l=m+1;
            else
              r=m-1;
        }
        return -1;
    }

