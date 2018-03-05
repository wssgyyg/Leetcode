public class UniquePathsII_63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int columns = obstacleGrid[0].length;
        int[][] dp = new int[rows][columns];

        dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;

        for (int i = 1; i < rows; i++) {
            dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i - 1][0];
        }

        for (int j = 1; j < columns; j++) {
            dp[0][j] = obstacleGrid[0][j] == 1 ? 0 : dp[0][j - 1];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[rows - 1][columns - 1];
    }

}
