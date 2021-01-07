/*
https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
Time complexity: O(N)
Space: O(1)


Given an array of size N-1 such that it can only contain distinct integers
in the range of 1 to N. Find the missing element.
 */

int MissingNumber(int a[], int n) {
        // Your Code Here
        int s1=1,s2=a[0];
        for(int i=2;i<=n;i++)
          s1=s1^i;
        for(int i=1;i<n-1;i++)
          s2=s2^a[i];
        return s1^s2;  
    }