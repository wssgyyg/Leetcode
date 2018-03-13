public class MaximalRectangle_85 {

    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] dp = new int[rows][columns];

        dp[0][0] = matrix[0][0] == '1' ? 1 : 0;
        for (int i = 1; i < rows; i++) {
            dp[i][0] = matrix[i][0] == '1' ? 1 : 0;
        }

        return 0;
    }

}
