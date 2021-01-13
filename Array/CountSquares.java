/*
https://practice.geeksforgeeks.org/problems/count-squares3649/1

Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number N, you have to output the number of integers less than N in the sample space S
Time complexity: O(sqrt(N))
Space complexity: O(1) */

static int countSquares(int N) {
        // code here
        int i=1,c=0;
        
        while(i*i<N){
            c++;
            i++;
        }
        return c;
    }