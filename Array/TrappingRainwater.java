/*https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/0/?track=dsa-workshop-1-arrays&batchId=308

Time complexity: O(N) 
Space complexity: O(N) since two arrays of size n were initialised
*/

static int trappingWater(int a[], int n) { 
        
        // Your code here
        int res=0;
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        
        //Compute max height on left side 
        lmax[0]=a[0];
        for(int i=1;i<n;i++)
         lmax[i]=Math.max(lmax[i-1],a[i]);
        
        //Compute max height on right side 
        rmax[n-1]=a[n-1]; 
        for(int i=n-2;i>=0;i--)
         rmax[i]=Math.max(rmax[i+1],a[i]);
         
        for(int i=1;i<n-1;i++){
            res+=Math.min(lmax[i],rmax[i])-a[i];
        }
        return res;
    } 