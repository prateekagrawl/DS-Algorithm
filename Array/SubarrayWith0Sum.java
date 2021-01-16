/*
https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1#
Time complexity: O(n)
Space complexity: O(n) */

static Boolean subArrayExists(int arr[]) 
    { 
        HashSet<Integer> hs = new HashSet<Integer>(); 
        int sum = 0;      
        for (int i = 0; i < arr.length; i++) 
        {  
            // Add current element to sum 
            sum += arr[i]; 
              
            // Return true in following cases 
            // a) Current element is 0 
            // b) sum of elements from 0 to i is 0 
            // c) sum is already present in hash map 
            if (arr[i] == 0 || sum == 0 || hs.contains(sum))                          
                return true; 
              
            // Add sum to hash set 
            hs.add(sum); 
        }  
        return false; 
    }  