public class LongestCommonPrefix_14 {

    public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            res = commonPrefix(res, strs[i]);
        }
        return res;
    }

    public static String commonPrefix(String string1, String string2) {
        int minLength = Math.min(string1.length(), string2.length());
        int i = 0;
        for (; i < minLength && string1.charAt(i) == string2.charAt(i); i++) {

        }
        return string1.substring(0, i);
    }

    public static void main(String[] args) {
        System.out.println(commonPrefix("hello", "hela"));
    }
}
