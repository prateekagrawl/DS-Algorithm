/**
https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Time complexity: O(n^2)
Space complexity: O(1) */

//Brute force:
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int res[] = new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
        return res;
    }
}

//Optimised Approach:
//    Time complexity: O(n)
//    Space complexity: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int res[]=new int[2];
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = target-nums[i];
            if(hs.containsKey(x)){
                res[0] = hs.get(x);
                res[1] = i;
                break;
            }
            else
                hs.put(nums[i],i);
        }
        return res;
    }
}