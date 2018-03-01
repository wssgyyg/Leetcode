public class DivideTwoIntegers_29 {

    public int divide(int dividend, int divisor) {

        if (dividend == 0) {
            return 0;
        }

        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }

        long ldividend = (long) dividend;
        long ldivisor = (long) divisor;

        boolean isPositive = false;
        if ((ldividend > 0 && ldivisor > 0) || (ldividend < 0 && ldivisor < 0)) {
            isPositive = true;
        }

        long temp = ldivide(Math.abs(ldividend), Math.abs(ldivisor));
        long result = isPositive ? temp : -temp;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int)result;
    }

    public long ldivide(long ldividend, long ldivisor) {
        if (ldividend < ldivisor) {
            return 0;
        }

        long sum = ldivisor;
        long multiple = 1;

        while ((sum + sum) <= ldividend) {
            sum += sum;
            multiple += multiple;
        }

        return multiple + ldivide(ldividend - sum, ldivisor);
    }

}
