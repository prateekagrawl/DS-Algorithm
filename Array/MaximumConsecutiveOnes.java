/**
https://leetcode.com/problems/max-consecutive-ones/
Time complexity: O(N)
Space complexity: O(1) */


public int findMaxConsecutiveOnes(int[] a) {
        int c=0,res=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                c++;
                res=Math.max(res,c);
            }
            else
                c=0;
        }
        return res;
    }