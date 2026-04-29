class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int j = 0, k = n - 1;
            while (j < k) {
                swap(matrix, i, j, i, k);
                j++;
                k--;
            }
        }
    }

    private void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }
}
