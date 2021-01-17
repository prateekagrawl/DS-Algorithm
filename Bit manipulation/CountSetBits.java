/*

https://practice.geeksforgeeks.org/problems/set-bits0143/1#

 Brian Kernighan’s Algorithm

Time complexity : O(log n)
Space complexity: O(1) */

static int countSetBits(int n) 
    { 
        int count = 0; 
        while (n > 0) { 
            n &= (n - 1); 
            count++; 
        } 
        return count; 
    }