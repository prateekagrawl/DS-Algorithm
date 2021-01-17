/*
https://practice.geeksforgeeks.org/problems/key-pair5616/1#

Time complexity: O(NlogN)
Space complexity: O(1) */

//Given an array arr of N positive integers and another number X. Determine whether or not there exist two elements in arr whose sum is exactly X.

// We assume all array elements are distinct and don't repeat 
boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Arrays.sort(arr);  
        int l=0,r=n-1;
        while(l<r){
            if(arr[l]+arr[r]==x)
              return true;
            else if(arr[l]+arr[r]<x)
              l++;
            else 
              r--;
        }
        return false;
    }