public class LongestPalindromicSubstring_5 {

    public String longestPalindrome(String s){

        String string = "";
        for (int i = 0; i < s.length(); i++){
            String palindrome1 = palindrome(i, i, s);
            String palindrome2 = palindrome(i, i + 1, s);
            String temp = palindrome1.length() > palindrome2.length() ? palindrome1 : palindrome2;
            if (temp.length() > string.length()){
                string = temp;
            }
        }

        return string;

    }

    public String palindrome(int left, int right, String s){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return s.substring(left + 1, right);
    }


}
