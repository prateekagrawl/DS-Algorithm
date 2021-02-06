 /**
 https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-logarithmic-official/ojquestion
 https://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/
 
 Time complexity: O(logn)
  */
 
 public static int power(int x, int n) {
        if(n==0)
          return 1;
        int pxnb2=power(x,n/2); //pxnb2 is x raised to the n/2
        int pxn=pxnb2*pxnb2;
        if(n%2!=0)
          pxn=x*pxn;
        return pxn;  
    }

 /////////////////*****
 public static int power(int x, int n) {
        if (n == 0)
            return 1;
        // int xnm1 = power(x, n - 1);
        // int xn = x * xnm1;
        // return xn;
        return x*power(x, n - 1);
        ////////////////////////