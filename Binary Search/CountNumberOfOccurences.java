/*
https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1

METHOD 1: 
Time complexity: O(log n)
Space complexity: O(1)


Algo.
Find first occurence of x using binary search.
find last occurence of x using binary search.
Subtract both the positions to find required answer.
*/

class Solution {
    int firstOcc(int a[],int l,int r,int x){
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]<x)
             l=m+1;
            else if(a[m]>x)
             r=m-1;
            else{
                if(m==0 || a[m-1]!=a[m])
                  return m;
                else //move leftwards eg{5,5,5,5}
                 r=m-1;
            }
            
        }return -1;
    }
    
    int lastOcc(int a[],int l,int r,int x,int n){
         while(l<=r){
            int m=(l+r)/2;
            if(a[m]<x)
             l=m+1;
            else if(a[m]>x)
             r=m-1;
            else{
                if(m==n-1 || a[m+1]!=a[m])
                  return m;
                else //move leftwards eg{5,5,5,5}
                 l=m+1;
            }
        }return -1;    
    }
    
    int count(int[] a, int n, int x) {
        // code here
        int i=firstOcc(a,0,n-1,x);
        int j=lastOcc(a,0,n-1,x,n);
        if(i==-1 && j==-1) //element not present
            return 0;
        return (j-i+1);    
    }
}

/*METHOD 2:


 Time complexity: O(log n+ count) where count is number of occurences
 Space complexity: O(1) */

 int binary(int a[],int l,int r,int x){
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x)
             return m;
            else if(a[m]<x)
             l++;
            else 
             r--;
        }
        return -1;
    }
    int count(int[] a, int n, int x) {
        // code here
        int ind=binary(a,0,n-1,x);
        if(ind==-1)
         return 0;
        int l=ind-1,c=1;
        while(l>=0 && a[l]==x){
            c++;
            l--;
        }
        int r=ind+1;
        while(r<n && a[r]==x){
            c++;r++;
        }
        return c;
    }