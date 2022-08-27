/*https://leetcode.com/problems/peak-index-in-a-mountain-array/

Time complexity: O(NlogN)
Space Complexity: O(1)      */


//Approach 1:
class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int r=a.length;
        int l=0,m=-1;
        while(l<=r){
            m=l+(r-l)/2;
            if(a[m]>a[m+1] && a[m]>a[m-1])
                return m;
            else if(a[m]<a[m+1])
                l=m+1;
            else
                r=m-1;
        }
        return -1;
    }
}


//Approach 2: love babbar solution
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int  s = 0 , e = arr.length-1;
        while(s<e){
            int mid = s + (e-s)/2;
            if(arr[mid]<arr[mid+1])
                s = mid+1;
            else
                e = mid;
        }
        return s;
    }
}
