/*
https://practice.geeksforgeeks.org/problems/product-array-puzzle4525/1#(excel sheet in searching section)

Time complexity: O(N)
Space complexity: O(N)  */

class abc{
public static long[] productExceptSelf(int a[], int n) 
	{ 
        // code here
        long res[]=new long[n];
        long l[]=new long[n];
        long r[]=new long[n];
        l[0]=1;
        r[n-1]=1;
        for(int i=1;i<n;i++) //find left product array
          l[i]=l[i-1]*a[i-1];
        //find right product array  
        for(int i=n-2;i>=0;i--){
            r[i]=r[i+1]*a[i+1];
        }
        
        //result array
        for(int i=0;i<n;i++)
          res[i]=l[i]*r[i];
        return res;
	}
}