public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reverse = 0;
        while (x != 0) {
            reverse = 10 * reverse + (x % 10);
            x /= 10;
        }
        return temp == reverse;
    }
}
