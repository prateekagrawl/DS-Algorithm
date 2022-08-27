//https://leetcode.com/problems/find-peak-element/

similar to FindPeakIndexInMountainArray

//Time complexity: O(NlogN)
//Space complexity: O(1)

class Solution {
    public int findPeakElement(int[] a) {
        int n=a.length;
        int r=a.length-1;
        int l=0,m=0;
        while(l<=r){
            m=l+(r-l)/2;
            if((m==n-1 || a[m]>a[m+1]) && (m==0 || a[m]>a[m-1]))
                return m;
            else if(m<n-1 && a[m]<a[m+1])
                l=m+1;
            else
                r=m-1;
        }
        return -1;
    }
}