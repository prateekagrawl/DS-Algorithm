// https://leetcode.com/problems/rotate-image/

// Time complexity: O(n^2) for transpose +O(n^2) for reversing = O(n^2) n being the length of row and column
// Space complexity: O(1)

class matrixRotation {
	//do dry run with indexes and then you'll get the idea
	public void rotate(int[][] matrix) {
		//transpose of matrix
		for(int i=0;i<matrix.length;i++){
			for(int j=i;j<matrix[0].length;j++){
				//swap matrix[i][j] with matrix[j][i]
				int t = matrix[i][j];
				matrix[i][j]= matrix[j][i];
				matrix[j][i] = t;
			}
		}
		int n= matrix[0].length;
		//reverse rows of the matrix
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length/2;j++){
				//swap matrix[i][j] with matrix[i][n-1-j]
				int t = matrix[i][j];
				matrix[i][j]= matrix[i][n-1-j];
				matrix[i][n-1-j] = t;
			}
		}
	}
}



