/*
https://leetcode.com/problems/search-a-2d-matrix/
Time complexity:O(log base2 (n*m))  or O(log2(n*m)) where n and m is size of row and column respectively
Space complexity: O(1)

Reference:  https://youtu.be/ZYpYur0znng

 */



class Search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int l = 0, h = row*col -1;

        while(l<=h){
            int mid = l + (h-l)/2;

            if(matrix[mid/col][mid%col] == target)
                return true;
                //like binary search, move l = mid+1
            else if(matrix[mid/col][mid%col] < target)
                l = mid+1;
            else
                h = mid-1;
        }
        return false;
    }
}