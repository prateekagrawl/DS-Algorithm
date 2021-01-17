 /*
 https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1#
 
 Time complexity: O(n^2)
 Space complexity : O(1) */
 
 /**
1. Sort the given array.
2. Loop over the array and fix the first element of the possible triplet, arr[i].
3. Then fix two pointers, one at i + 1 and the other at n – 1. And look at the sum, 
4. If the sum is smaller than the required sum, increment the first pointer.
5. Else, If the sum is bigger, Decrease the end pointer to reduce the sum.
6. Else, if the sum of elements at two-pointer is equal to given sum then print the triplet and break. */
 
 public static int find3Numbers(int a[], int n, int x) { 
      // Your code Here
       Arrays.sort(a);
       for(int i=0;i<n-2;i++){
           int l=i+1;
           int r=n-1;
           while(l<r){
               if(a[l]+a[r]+a[i]==x)
                 return 1;
               else if(a[l]+a[r]+a[i]<x)
                 l++;
               else
                 r--;
           }
           
       }
       return 0;