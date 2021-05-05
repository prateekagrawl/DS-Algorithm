// https://leetcode.com/problems/rotate-image/

// Time complexity: O(n*n) n being the length of row and column
// Space complexity: O(1)


public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    
    public void transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
    }
    
    public void reverse(int matrix[][]){
        int n=matrix.length;
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
    }




    //for anticlockwise, same code except some reverse function changes

    static void reverseColumns(int arr[][])
	{
		for (int i = 0; i < arr[0].length; i++){
			int l=0 , r= arr.length-1;
            while(l<=r){
                int temp = arr[l][i];
				arr[l][i] = arr[r][i];
				arr[r][i] = temp;
                l++;
                r--;
            }
	}}