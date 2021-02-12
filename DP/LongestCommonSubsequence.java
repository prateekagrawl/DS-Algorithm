/**
https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1
Time complexity: O(mn)
Space O(mn) */

static int lcs(int m, int n, String s1, String s2){
        // your code here
        int dp[][]=new int[m+1][n+1];
		     for(int i=1;i<=m;i++){
		         for(int j=1;j<=n;j++){
		             if(s1.charAt(i-1)==s2.charAt(j-1))
		                dp[i][j]=1+dp[i-1][j-1];
		             else  
		                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
		         }
		     }
		     return dp[m][n];
    }