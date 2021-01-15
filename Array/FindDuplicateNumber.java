/**
https://leetcode.com/problems/find-the-duplicate-number/

Time complexity: O(N)
Space complecity: O(1)


Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 */

// Solution similar to REPEATED AND MISSING PROBLEM 

public int findDuplicate(int[] a) {
        int res=0;
        for(int i=0;i<a.length;i++){
            int val=Math.abs(a[i]);
            if(a[val-1]>0)
                a[val-1]=-a[val-1]; //mark it visited
            else{
                res=val;
                break;
            }
         }
        return res;
    }