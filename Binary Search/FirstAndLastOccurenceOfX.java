//https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x/0#

static int first(int a[],int l,int r,int x){
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]>x)
              r=m-1;
            else if(a[m]<x)
              l=m+1;
            else {
                if(m==0 || a[m-1]!=a[m])
                  return m;
                else //not the first occurence hence go to the left
                  r=m-1;
            }  
              
        }
        return -1;
    }
    static int last(int a[],int l,int r,int x,int n){
          while(l<=r){
            int m=(l+r)/2;
            if(a[m]>x)
              r=m-1;
            else if(a[m]<x)
              l=m+1;
            else {
                if(m==n-1 || a[m]!=a[m+1])
                  return m;
                else //we've element(x) on the right eg.{5,5,5,5} we move right.
                  l=m+1;
            }  
              
        }
        return -1;
    }
    
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		        a[i]=sc.nextInt();
		    int r1=first(a,0,n-1,x);
		    int r2=last(a,0,n-1,x,n);
		    if(r1==-1&& r2==-1)
    		  System.out.println("-1");
    		else   
		    System.out.println(r1+" "+r2);
		}
	}