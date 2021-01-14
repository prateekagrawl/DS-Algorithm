  /*
  https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1#
  Time complexity: O(N)
  Space complexity: O(1) */

  static void swap(int a[],int i,int j){
       int t=a[i];
       a[i]=a[j];
       a[j]=t;
    }
    public static void convertToWave(int a[], int n){
        // traverse through only even positions and swap i & i+1 values to make it greater
        for(int i=0;i<n-1;i=i+2)
          swap(a,i,i+1);

    }

    // Alternatively, make even positions greater.
    public static void convertToWave(int a[], int n){
        for(int i=0;i<n;i=i+2){
            if(i>0 && a[i]<a[i-1]) //if element smaller than its previous position,SWAP
              swap(a,i,i-1);
            if(i<n-1 && a[i]<a[i+1]) //if element smaller than its next position,SWAP
             swap(a,i,i+1);
        }
        
    }