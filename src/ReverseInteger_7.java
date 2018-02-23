public class ReverseInteger_7 {

    public int reverse(int x) {
        int sign = x >= 0 ? 1 : -1;
        x = Math.abs(x);

        int result = 0;
        while (x > 0){
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return sign * result;

    }

    public static void main(String[] args) {
        int a = 5;
        int x = a;
        a = 10;
        System.out.println(x);
    }

}
