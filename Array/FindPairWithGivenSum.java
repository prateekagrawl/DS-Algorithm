/*

https://practice.geeksforgeeks.org/problems/find-pair-given-difference/0#

Given an unsorted array Arr[] and a number N. You need to write a program to find if there exists a pair of elements in the array whose difference is N.

Time complexity: O(NlogN)
Space complexity: O(1) */

public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t-->0){
		        int l=sc.nextInt(); //l is length of array
		        int n=sc.nextInt(); // n denotes the difference between two elements
		        int a[]=new int[l];
		        for(int i=0;i<l;i++)
		          a[i]=sc.nextInt();
		        Arrays.sort(a);        
		        System.out.println(pairFound(a,l,n));    
		    }}
	
	static int pairFound(int a[],int l,int n){
	    int i=0,j=1;
	    while(i<l && j<l){
	        if(i!=j && a[j]-a[i]==n)
	           return 1;
	        else if(a[j]-a[i]<n)
	           j++;
	        else
	           i++;
	    }
	    return -1;
	}