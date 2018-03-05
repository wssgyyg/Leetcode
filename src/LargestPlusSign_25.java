import jdk.internal.util.xml.impl.Pair;

import java.util.Arrays;
import java.util.Collections;

public class LargestPlusSign_25 {

    public int orderOfLargestPlusSign(int N, int[][] mines) {

        int[][] dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], N);
        }

        for (int[] mine : mines) {
            dp[mine[0]][mine[1]] = 0;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0, l = 0; j < N; j++) {
                dp[i][j] = Math.min(dp[i][j], l = (dp[i][j] == 0 ? 0 : l + 1));
            }

            for (int k = N - 1, r = 0; k >= 0; k--) {
                dp[i][k] = Math.min(dp[i][k], r = (dp[i][k] == 0 ? 0 : r + 1));
            }

            for (int j = 0, u = 0; j < N; j++) {
                dp[j][i] = Math.min(dp[j][i], u = (dp[j][i] == 0 ? 0 : u + 1));
            }

            for (int k = N - 1, d = 0; k >= 0; k--) {
                dp[k][i] = Math.min(dp[k][i], d = (dp[k][i] == 0 ? 0 : d + 1));
            }
        }

        int curMax = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (curMax < dp[i][j]) {
                    curMax = dp[i][j];
                }
            }
        }

        return curMax;

    }

    public static void main(String[] args) {
        int[][] a = new int[2][3];
        for (int i = 0; i < a.length; i++) {
            Arrays.fill(a[i], 1);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }

}