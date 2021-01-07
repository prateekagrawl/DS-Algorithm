/*
https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1#

Time complexity: O(N)
Space complexity: O(1)*/

int maxSubarraySum(int a[], int n){
        
        // Your code here
        int cursum=a[0],max=a[0];
        for(int i=1;i<n;i++){
            cursum=Math.max(cursum+a[i],a[i]);
            max=Math.max(max,cursum);
        }
        return max;   
    }