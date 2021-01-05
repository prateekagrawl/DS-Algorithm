/*
https://practice.geeksforgeeks.org/problems/reversal-algorithm5340/1

Time complexity: O(N)
Space complexity: O(1)
*/

void reverse(int a[],int l,int r){
        while(l<=r){
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
    }
    void leftRotate(int[] a, int n, int d) {
        // code here
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);
    }