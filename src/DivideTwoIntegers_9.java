public class DivideTwoIntegers_9 {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int sign;
        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) {
            sign = 1;
        } else {
            sign = -1;
        }

        return sign * divideHelper(Math.abs(dividend), Math.abs(divisor));

    }

    public int divideHelper(int ldividend, int ldivisor) {
        if (ldividend < ldivisor) return 0;

        //  Find the largest multiple so that (divisor * multiple <= dividend),
        //  whereas we are moving with stride 1, 2, 4, 8, 16...2^n for performance reason.
        //  Think this as a binary search.
        int sum = ldivisor;
        int multiple = 1;
        while (((long)sum+sum) <= ldividend) {
            sum += sum;
            multiple += multiple;
        }
        //Look for additional value for the multiple from the reminder (dividend - sum) recursively.
        return multiple + divideHelper(ldividend - sum, ldivisor);
    }

}
