/*

https://leetcode.com/problems/spiral-matrix/

Time complexity: O(N), where N is the total number of elements in the input matrix.
Space: O(N), where N is the total number of elements in the input matrix.

*/
public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        int m= matrix.length;
        int n= matrix[0].length;
        int t=0, b= m-1; //t= top, b= bottom
        int l=0, r=n-1;  //l=left, r= right
        int d=0; //d=0 means printing l to r, d=1 means printing t to b, d=2 =>r to l, d=3 => b to t.
        while(t<=b && l<=r){
            if(d==0){
                for(int i=l;i<=r;i++)
                    ls.add(matrix[t][i]);
                t++; //increment top
            }
            else if(d==1){
                for(int i=t;i<=b;i++)
                    ls.add(matrix[i][r]);
                r--; //decrement right pointer
            }
            else if(d==2){
                for(int i=r;i>=l;i--)
                    ls.add(matrix[b][i]);
                b--; //decrement bottom pointer
            }
            else if(d==3){
                for(int i=b;i>=t;i--)
                    ls.add(matrix[i][l]);
                l++;
            }
            d=(d+1)%4; //for changing d value after every iteration
        }
        return ls;
    }