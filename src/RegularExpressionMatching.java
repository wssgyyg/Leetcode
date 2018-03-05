public class RegularExpressionMatching {

    public boolean isMatch(String string, String pattern) {
        int m = string.length();
        int n = pattern.length();

        boolean[][] f = new boolean[m + 1][n + 1];

        f[0][0] = true;

        for (int i = 1; i <= m; i++) {
            f[i][0] = false;
        }

        for (int j = 1; j <= n; j++) {
            f[0][j] = (j > 1) && f[0][j - 2] && pattern.charAt(j - 1) == '*';
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (pattern.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2] || ((string.charAt(i - 1) == pattern.charAt(j - 2) || pattern.charAt(j - 2) == '.') && f[i - 1][j]);
                } else {
                    f[i][j] = f[i - 1][j - 1] && (string.charAt(i - 1) == pattern.charAt(j - 1) || pattern.charAt(j - 1) == '.');
                }
            }
        }
        return f[m][n];
    }

}
