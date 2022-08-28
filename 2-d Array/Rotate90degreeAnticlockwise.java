

class RotateAnticlockwise
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n)
    {
        // code here

        //   Reverse every individual row
        for(int i=0;i<n;i++){
            int l=0, r=n-1;
            while(l<=r){
                int t= matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]= t;
                l++;
                r--;
            }
        }

        // Perform transpose
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                //swap [i,j] with [j,i]
                int t = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = t;
            }
        }

    }
}