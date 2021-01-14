/*
https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1#
Time complexity: O(N)
Space complexity: O(1)*/

// Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.

int[] findTwoElement(int a[], int n) {
        // code here
        int res[]=new int[2];
        for(int i=0;i<n;i++){
            int val=Math.abs(a[i]);
            if(a[val-1]>0)
             a[val-1]=-a[val-1];  //mark it negative
            else 
             res[0]=val;  //repeating element
        }
        for(int i=0;i<n;i++){
            if(a[i]>0)
              res[1]=(i+1);
        }
        return res;