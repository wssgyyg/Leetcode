public class WildcardMatching_44 {

    public boolean isMatch(String s, String p) {
        int sLength = s.length();
        int pLength = p.length();
        boolean[][] dp = new boolean[sLength + 1][pLength + 1];
        dp[0][0] = true;

        for (int i = 1; i <= sLength; i++) {
            dp[i][0] = false;
        }

        for (int i = 1; i <= pLength; i++) {
            dp[0][i] = p.charAt(i - 1) == '*' && dp[0][i - 1];
        }

        for (int i = 1; i <= sLength; i++) {
            for (int j = 1; j <= pLength; j++) {
                if (p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i - 1][j - 1];
                } else {
                    dp[i][j] = s.charAt(i - 1) == p.charAt(j - 1) && dp[i - 1][j - 1];
                }
            }
        }

        return dp[sLength][pLength];
    }

}
