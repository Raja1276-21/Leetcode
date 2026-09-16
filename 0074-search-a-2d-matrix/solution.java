class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        
        int low = 0;
        int high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Map 1D index (mid) to 2D matrix indices (row, col)
            int row = mid / n;
            int col = mid % n;

            int midVal = matrix[row][col];

            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
