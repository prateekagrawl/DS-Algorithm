// https://leetcode.com/problems/counting-bits/

// Time complexity: O(n) 
// Space complexity: O(n) for res[]

 public int[] countBits(int num) {
        int res[]= new int[num+1];
        res[0]=0;
        for(int i=1;i<=num;i++){
            if(i%2==0)
                res[i]=res[i/2];
            else
                res[i]=1+ res[i/2];
        }
        return res;
    }