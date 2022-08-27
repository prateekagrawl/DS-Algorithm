
https://leetcode.com/problems/powx-n/

Time complexity: O(log2N) log (base2) N
Space complexity: O(1)


class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0000;
        long nn = n; //so that overflow doesn't happen
        if(nn<0)
            nn = -1 * nn; //make nn positive here
        while(nn>0){
            if(nn%2==1){
                ans = ans*x;
                nn=nn-1;
            }
            else{
                x = x*x;
                nn =nn/2;
            }
        }

        if(n<0) ans = (double)1.0/ans; //for negative case, just divide it
        return ans;
    }
}