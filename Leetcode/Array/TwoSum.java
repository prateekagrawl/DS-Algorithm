/**
https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

Time complexity: O(n)
Space complexity: O(n) */

public int[] twoSum(int[] a, int target) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int x=target-a[i];
            if(hs.containsKey(x)){
               return new int[]{hs.get(x), i}; //to return an array of size 2
            }
            else
                hs.put(a[i],i);
        }
         throw new IllegalArgumentException();
    }