/*
https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1#

First approach: Brute force . Time complexity: O(n^3)
Run three loops,
        1. i from 0 to (n-1)
        2. j from i to (n-1)
        3. k from (i to j) which will calculate the sum and find max sum in subarray


Second approach: Kadane's algorithm



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

---------------------------------------------------------
OR this solution by Striver.
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, res = nums[0];
        for(int i=0;i<nums.length;i++){
            sum = sum+ nums[i];
            //update res if sum is greater than res
            if(sum > res){
                res = sum;
            }
            //if sum is negative, initialise sum with 0 coz we want to maximize the subarray sum, carrying a negative sum won't do any good.
            if(sum<0)
                sum=0;
        }
        return res;
    }
}


-------------