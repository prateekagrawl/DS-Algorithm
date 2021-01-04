/*
https://practice.geeksforgeeks.org/problems/first-repeating-element4018/1

Time complexity: O(nlogn)
Spae complexity: O(n) //we took temp[n]. */


static int binary(int a[],int l,int r,int x){   //3
    while(l<=r){
        int mid=(l+r)/2;
        if(a[mid]==x)
          return mid;
        else if(a[mid]<x)
          l=mid+1;
        else 
          r=mid-1;
    }
    return -1;
}
static int countOccurences(int a[],int n,int x){  //2
    int ind=binary(a,0,n-1,x);
    if(ind== -1)
      return 0;
      
    int c=1;
    int left=ind-1;
    while(left>=0 && a[left]==x){
        c++;
        left--;
    }
    
    int right=ind+1;
    while(right<n && a[right]==x){
        c++;
        right++;
    }
    return c;
}
public static int firstRepeated(int []a, int n) //1
{
    //Your code here
    int temp[]=new int[n];
    //copy contents
    for(int i=0;i<n;i++)
      temp[i]=a[i];
    Arrays.sort(temp);
    for(int i=0;i<n;i++){
        int x=a[i];
        int count=countOccurences(temp,n,x);
        if(count>1)
          return (i+1);
    }
    return -1;
}