/*

https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1/?track=dsa-workshop-1-search-sort&batchId=308

Time complexity: O(N)
Space complexity: O(1) */

// Dutch national flag algo is used
1. if 0,swap a[low] and a[mid] values and increment both pointers
2. if a[m]=1,simply increment m
3. if a[m]=2, swap a[mid] and a[high] values an decrement high pointer


public static void sort012(int a[], int n){
    // code here 
    int l=0,m=0,h=n-1;
    while(m<=h){
        if(a[m]==0){
            int t=a[l];
            a[l]=a[m];
            a[m]=t;
            l++;
            m++;
        }
        else if(a[m]==1){
            m++;
        }
        else
        {
            int t=a[m];
            a[m]=a[h];
            a[h]=t;
            h--;
        }
    }